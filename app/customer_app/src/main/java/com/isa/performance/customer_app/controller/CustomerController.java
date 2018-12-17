package com.isa.performance.customer_app.controller;

import com.isa.performance.customer_app.data.Customer;
import com.isa.performance.customer_app.repository.CustomerRepository;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("/customer")
public class CustomerController {

  private final CustomerRepository customerRepository;

  public CustomerController(CustomerRepository customerRepository) {
    this.customerRepository = customerRepository;
  }

  @GetMapping
  public Flux<Customer> getCustomers() {
    return customerRepository.findAll();
  }

  @GetMapping("/{id}")
  public Mono<Customer> getCustomer(@PathVariable String id) {
    return customerRepository.findById(id);
  }

  @PostMapping
  public Mono<Customer> addCustomer(@RequestBody Customer customer) {
    return customerRepository.save(customer);
  }

}
