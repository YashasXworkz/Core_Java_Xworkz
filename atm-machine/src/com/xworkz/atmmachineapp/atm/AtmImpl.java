package com.xworkz.atmmachineapp.atm;

import com.xworkz.atmmachineapp.customer.*;
import com.xworkz.atmmachineapp.exceptions.*;

public class AtmImpl implements Atm {
  Customer[] customer;
  int index;
  
  public AtmImpl(int size) {
    customer = new Customer[size];
  }
  
  @Override
  public boolean addCustomer(Customer customer) {
    System.out.println("Invoked addCustomer method");
    boolean isAdded = false;
    if (customer != null) {
      System.out.println("Customer check is completed... Proceeding to add the customer");
      if (customer.getCustomerName() != null && !customer.getCustomerName().isEmpty()) {
        this.customer[index++] = customer;
        isAdded = true;
        System.out.println("Customer data added successfully!");
      } else {
        System.out.println("Customer name is empty...");
      }
    } else {
      System.out.println("Customer object is null...");
    }
    return isAdded;
  }
  
  @Override
  public void getAllCustomers() {
    System.out.println("Invoked getAllCustomers method");
    System.out.println("List of Customers:");
    for (Customer cust : this.customer) {
      System.out.println(cust);
    }
  }
  
  @Override
  public void withdraw(int id, int amount, int userPin) throws InsufficientBalanceException, WrongPinException {
    System.out.println("Invoked withdraw method");
    verifyAtmPin(userPin);
    for (Customer c : this.customer) {
      if (c.getCustomerId() == id) {
        if (amount > 0 && amount % 10 == 0) {
          if (amount <= c.getInitialBalance()) {
            c.setInitialBalance(c.getInitialBalance() - amount);
            System.out.println("Balance after withdraw: " + c.getInitialBalance());
          } else {
            throw new InsufficientBalanceException();
          }
        } else {
          throw new InvalidAmountException();
        }
      }
    }
  }
  
  @Override
  public void verifyAtmPin(int enteredPin) throws WrongPinException {
    System.out.println("Invoked verifyAtmPin method");
    boolean isVerified = false;
    for (Customer c : this.customer) {
      if (enteredPin == c.getAtmPin()) {
        isVerified = true;
        break;
      }
    }
    if (!isVerified) {
      throw new WrongPinException();
    }
  }
}