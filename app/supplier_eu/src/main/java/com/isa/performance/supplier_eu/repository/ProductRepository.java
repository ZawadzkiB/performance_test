package com.isa.performance.supplier_eu.repository;

import com.isa.performance.supplier_eu.data.Products;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;

public interface ProductRepository extends ReactiveMongoRepository<Products, String> {
}
