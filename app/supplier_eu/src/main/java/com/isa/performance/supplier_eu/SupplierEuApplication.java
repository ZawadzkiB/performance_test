package com.isa.performance.supplier_eu;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

@SpringBootApplication
@EnableMongoRepositories
public class SupplierEuApplication {

	public static void main(String[] args) {
		SpringApplication.run(SupplierEuApplication.class, args);
	}

}
