package com.xworkz.ecommerceapp.customer;

import com.xworkz.ecommerceapp.enums.Gender;
import com.xworkz.ecommerceapp.enums.PaymentMethod;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@NoArgsConstructor
public class Customer {
  private int customerId;
  private String customerName;
  private String email;
  private long mobileNumber;
  private String password;
  private Gender gender;
  private String productName;
  private int productQuantity;
  private PaymentMethod paymentMethod;
}
