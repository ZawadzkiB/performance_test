package com.sii.performance.order_app.controller;

import com.sii.performance.order_app.data.Order;
import com.sii.performance.order_app.data.PostOrderRequest;
import com.sii.performance.order_app.service.OrderService;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("/order")
public class OrderController {

  private final OrderService orderService;

  public OrderController(OrderService orderService){
    this.orderService = orderService;
  }

  @PostMapping
  public Mono<Order> addOrder(@RequestBody PostOrderRequest postOrderRequest) {
    return orderService.addOrder(postOrderRequest);
  }

  @GetMapping
  public Flux<Order> getOrders() {
    return orderService.getOrders();
  }

}
