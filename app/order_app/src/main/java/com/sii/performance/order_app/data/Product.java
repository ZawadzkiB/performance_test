package com.sii.performance.order_app.data;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Product {

  private Integer id;
  private String name;
  private String brand;
  private String model;
  private String description;
  private String category;
  private BigDecimal price;
  private BigDecimal marketPrice;

}
