package com.sii.performance.order_app.data;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Order {

  @Id private String id;
  private Customer customer;
  private List<Product> products;
}
