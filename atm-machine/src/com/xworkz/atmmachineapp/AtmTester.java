package com.xworkz.atmmachineapp;

import com.xworkz.atmmachineapp.atm.*;
import com.xworkz.atmmachineapp.customer.*;
import com.xworkz.atmmachineapp.exceptions.*;

import java.util.*;

public class AtmTester {
  public static void main(String[] args) {
    System.out.println("Invoked main method");
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the number of customers to be added: ");
    int size = sc.nextInt();
    Atm atm = new AtmImpl(size);
    
    for (int customerIndex = 0; customerIndex < size; customerIndex++) {
      Customer customer = new Customer();
      System.out.println("Enter id: ");
      customer.setCustomerId(sc.nextInt());
      System.out.println("Enter name: ");
      customer.setCustomerName(sc.next());
      System.out.println("Enter atm pin: ");
      customer.setAtmPin(sc.nextInt());
      System.out.println("Enter initial balance: ");
      customer.setInitialBalance(sc.nextInt());
      boolean addedCustomer = atm.addCustomer(customer);
    }
    
    String text;
    do {
      System.out.println("""
          Enter your choice:
          1. Get all customer details
          2. Withdraw amount""");
      
      int choice = sc.nextInt();
      switch (choice) {
        case 1 -> atm.getAllCustomers();
        case 2 -> {
          System.out.println("Enter id, amount, atm pin to withdraw: ");
          try {
            atm.withdraw(sc.nextInt(), sc.nextInt(), sc.nextInt());
          } catch (InsufficientBalanceException | InvalidAmountException | WrongPinException |
                   InputMismatchException e) {
            e.printStackTrace();
          }
        }
        default -> System.out.println("Invalid choice!");
      }
      System.out.println("Do you want to continue y/n:");
      text = sc.next();
    } while (text.equals("y"));
  }
}
