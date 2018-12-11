package com.isa.performance.supplier_us.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.math.BigDecimal;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "product")
public class Product {

  @Id private Integer id;
  @Column private String name;
  @Column private String brand;
  @Column private String model;
  @Column private String description;
  @Column private String category;
  @Column private BigDecimal price;
  @Column(name = "marketprice") private BigDecimal marketPrice;

}
