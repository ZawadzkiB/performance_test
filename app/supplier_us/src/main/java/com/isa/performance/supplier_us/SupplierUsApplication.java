package com.isa.performance.supplier_us;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class SupplierUsApplication {

	public static void main(String[] args) {
		SpringApplication.run(SupplierUsApplication.class, args);
	}
}
