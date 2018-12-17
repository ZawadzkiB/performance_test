package com.sii.performance.order_app.data;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class PostOrderRequest {

  private String customerId;
  private List<Integer> productsIds;
}
