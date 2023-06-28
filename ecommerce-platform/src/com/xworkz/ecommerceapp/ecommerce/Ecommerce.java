package com.xworkz.ecommerceapp.ecommerce;

import com.xworkz.ecommerceapp.customer.Customer;

public interface Ecommerce {
  boolean addCustomer(Customer customer);
  void getAllCustomers();
  Customer getCustomerById(int customerId);
  boolean updateCustomerMobNoById(int existingId, long updatedMobNo);
  boolean updateCustomerNameById(int existingId, String updatedCustomerName);
  String[] getCustomerNameBySamePaymentMethod(String paymentMethod);
  boolean updateCustomerEmailById(int existingId, String updatedEmail);
  String getProductNameByCustomerName(String customerName);
  Customer increaseProductQuantityById(int customerId, int quantityToAdd);
}
