package com.xworkz.atmmachineapp.customer;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@ToString
public class Customer {
  private int customerId;
  private String customerName;
  private int atmPin;
  private int initialBalance;
}
