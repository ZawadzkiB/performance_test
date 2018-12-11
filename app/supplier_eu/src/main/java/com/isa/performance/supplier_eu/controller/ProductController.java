package com.isa.performance.supplier_eu.controller;

import com.isa.performance.supplier_eu.data.Products;
import com.isa.performance.supplier_eu.repository.ProductRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("/products")
public class ProductController {

  private final ProductRepository productRepository;

  public ProductController(ProductRepository productRepository) {
    this.productRepository = productRepository;
  }

  @GetMapping
  public Flux<Products> getProducts(){
    return productRepository.findAll();
  }

  @PostMapping
  public Mono<Products> addProduct(Products product){
    return productRepository.save(product);
  }

}
