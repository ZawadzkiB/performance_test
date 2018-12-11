package com.isa.performance.supplier_eu.data;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;

import java.math.BigDecimal;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Products {

  @Id
  private String id;
  private String name;
  private String brand;
  private String description;
  private List<String> categories;
  private BigDecimal price;
  private BigDecimal marketPrice;
  private List<String> attributes;

}
