package com.isa.performance.customer_app.repository;

import com.isa.performance.customer_app.data.Customer;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;

public interface CustomerRepository extends ReactiveMongoRepository<Customer, String> {
}
