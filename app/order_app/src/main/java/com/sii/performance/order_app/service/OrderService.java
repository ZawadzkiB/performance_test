package com.sii.performance.order_app.service;

import com.sii.performance.order_app.data.Customer;
import com.sii.performance.order_app.data.Order;
import com.sii.performance.order_app.data.PostOrderRequest;
import com.sii.performance.order_app.data.Product;
import com.sii.performance.order_app.repository.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import java.util.ArrayList;
import java.util.List;

@Service
public class OrderService {

  @Autowired
  private DiscoveryClient discoveryClient;

  private final OrderRepository orderRepository;

  public OrderService(OrderRepository orderRepository){
    this.orderRepository = orderRepository;
  }

  public Mono<Order> addOrder(PostOrderRequest postOrderRequest) {
    WebClient productClient = WebClient.create(discoveryClient.getInstances("product").get(0).getUri().toString());
    WebClient customerClient = WebClient.create(discoveryClient.getInstances("customer").get(0).getUri().toString());

    Mono<Customer> customerMono = customerClient
            .get().uri("/api/customer/" + postOrderRequest.getCustomerId())
            .retrieve().bodyToMono(Customer.class);

    List<Product> products = new ArrayList<>();
    postOrderRequest.getProductsIds().forEach(
            it -> products.add(productClient.get()
                    .uri("/api/product/" + it.toString())
                    .retrieve().bodyToMono(Product.class).block()));

    Order order = new Order();
    order.setCustomer(customerMono.block());
    order.setProducts(products);

    return orderRepository.save(order);
  }

  public Flux<Order> getOrders() {
    return orderRepository.findAll();
  }
}
