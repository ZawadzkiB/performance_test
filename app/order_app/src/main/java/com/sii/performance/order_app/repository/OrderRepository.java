package com.sii.performance.order_app.repository;

import com.sii.performance.order_app.data.Order;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;

public interface OrderRepository extends ReactiveMongoRepository<Order,String> {
}
