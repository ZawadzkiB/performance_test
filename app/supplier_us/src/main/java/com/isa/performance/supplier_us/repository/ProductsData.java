package com.isa.performance.supplier_us.repository;

import com.isa.performance.supplier_us.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductsData extends JpaRepository<Product,Integer> {
}
