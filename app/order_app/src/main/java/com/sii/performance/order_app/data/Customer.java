package com.sii.performance.order_app.data;

import lombok.*;
import org.springframework.data.annotation.Id;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Customer {

  @Id
  private String id;
  private String firstName;
  private String lastName;
  private String address;
  private String email;
  private Integer phoneNumber;
}
