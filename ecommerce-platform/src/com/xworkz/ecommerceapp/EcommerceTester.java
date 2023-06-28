package com.xworkz.ecommerceapp;

import com.xworkz.ecommerceapp.customer.Customer;
import com.xworkz.ecommerceapp.ecommerce.Amazon;
import com.xworkz.ecommerceapp.ecommerce.Ecommerce;
import com.xworkz.ecommerceapp.enums.Gender;
import com.xworkz.ecommerceapp.enums.PaymentMethod;

import java.util.Scanner;

public class EcommerceTester {
  public static void main(String[] args) {
    System.out.println("Invoked main method");
    System.out.println("Enter the number of customers to be added: ");
    Scanner sc = new Scanner(System.in);
    String text;
    int size = sc.nextInt();
    
    Ecommerce ecommerce = new Amazon(size);
    
    for (int customerIndex = 0; customerIndex < size; customerIndex++) {
      Customer customer = new Customer();
      System.out.println("Enter Id: ");
      customer.setCustomerId(sc.nextInt());
      System.out.println("Enter name: ");
      customer.setCustomerName(sc.next());
      System.out.println("Enter email: ");
      customer.setEmail(sc.next());
      System.out.println("Enter mobile number: ");
      customer.setMobileNumber(sc.nextLong());
      System.out.println("Enter password: ");
      customer.setPassword(sc.next());
      System.out.println("Select gender: male, female, transgender, lgbt");
      customer.setGender(Gender.valueOf(sc.next().toUpperCase()));
      System.out.println("Enter product name: ");
      customer.setProductName(sc.next());
      System.out.println("Enter product quantity: ");
      customer.setProductQuantity(sc.nextInt());
      System.out.println("Select payment method: debitcard, creditcard, cod, upi");
      customer.setPaymentMethod(PaymentMethod.valueOf(sc.next().toUpperCase()));
      boolean addedCustomer = ecommerce.addCustomer(customer);
      System.out.println(addedCustomer);
    }
    
    do {
      System.out.println("Enter your option:\n1. Get all customers details \n2. Get customer details by customer Id \n3. Update customer mobile number by customer Id \n4. Update customer name by customer Id \n5. Get all customer names with same payment method \n6. Update customer email by customer Id \n7. Get product name by customer name \n8. Increase product quantity by customer Id");
      int option = sc.nextInt();
      switch (option) {
        case 1:
          ecommerce.getAllCustomers();
          break;
        
        case 2:
          System.out.println("Enter customer Id to find customer details: ");
          Customer cust = ecommerce.getCustomerById(sc.nextInt());
          System.out.println(cust);
          break;
        
        case 3:
          System.out.println("Enter customer Id and new mobile number: ");
          boolean updatedCustomerMobNoById = ecommerce.updateCustomerMobNoById(sc.nextInt(), sc.nextLong());
          System.out.println(updatedCustomerMobNoById);
          break;
        
        case 4:
          System.out.println("Enter customer Id and new customer name: ");
          boolean updatedCustomerNameById = ecommerce.updateCustomerNameById(sc.nextInt(), sc.next());
          System.out.println(updatedCustomerNameById);
          break;
        
        case 5:
          System.out.println("Enter customer payment method to find customer names: ");
          String[] customerNameBySamePaymentMethod = ecommerce.getCustomerNameBySamePaymentMethod(sc.next().toUpperCase());
          System.out.println("List of customers with the same payment method: ");
          for (String customerName : customerNameBySamePaymentMethod) {
            if (customerName != null) {
              System.out.println(customerName);
            }
          }
          break;
        
        case 6:
          System.out.println("Enter customer Id and new email: ");
          boolean updatedCustomerEmailById = ecommerce.updateCustomerEmailById(sc.nextInt(), sc.next());
          System.out.println(updatedCustomerEmailById);
          break;
        
        case 7:
          System.out.println("Enter customer name to find product name: ");
          String productNameByCustomerName = ecommerce.getProductNameByCustomerName(sc.next());
          System.out.println(productNameByCustomerName);
          break;
        
        case 8:
          System.out.println("Enter customer id and new product quantity: ");
          Customer customer = ecommerce.increaseProductQuantityById(sc.nextInt(), sc.nextInt());
          System.out.println(customer);
      }
      System.out.println("Do you want to continue: y/n");
      text = sc.next();
    } while (text.equals("y"));
  }
}
