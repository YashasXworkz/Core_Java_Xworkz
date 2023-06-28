package com.xworkz.ecommerceapp.ecommerce;

import com.xworkz.ecommerceapp.customer.Customer;

public class Amazon implements Ecommerce {
  Customer[] customer;
  int index;
  
  public Amazon(int size) {
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
        System.out.println("Customer data added successfully");
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
  public Customer getCustomerById(int customerId) {
    System.out.println("Invoked getCustomerById method");
    Customer cust = null;
    if (customerId != 0) {
      for (Customer c : this.customer) {
        if (c.getCustomerId() == customerId) {
          cust = c;
        }
      }
    } else {
      System.out.println("Invalid customer ID");
    }
    return cust;
  }
  
  @Override
  public boolean updateCustomerMobNoById(int existingId, long updatedMobNo) {
    System.out.println("Invoked updateCustomerMobNoById method");
    boolean isUpdated = false;
    if (existingId != 0 && updatedMobNo != 0) {
      for (Customer c : this.customer) {
        if (c.getCustomerId() == existingId) {
          c.setMobileNumber(updatedMobNo);
          isUpdated = true;
          System.out.println("Mobile number updated successfully!");
          System.out.println(c);
        }
      }
    } else {
      System.out.println("Invalid existing id OR updated mobile number");
    }
    return isUpdated;
  }
  
  @Override
  public boolean updateCustomerNameById(int existingId, String updatedCustomerName) {
    System.out.println("Invoked updateCustomerNameById method");
    boolean isUpdated = false;
    if (existingId != 0 && updatedCustomerName != null && !updatedCustomerName.isEmpty()) {
      for (Customer c : this.customer) {
        if (c.getCustomerId() == existingId) {
          c.setCustomerName(updatedCustomerName);
          isUpdated = true;
          System.out.println("Name updated successfully!");
          System.out.println(c);
        }
      }
    } else {
      System.out.println("Invalid existing ID OR updated customer name");
    }
    return isUpdated;
  }
  
  @Override
  public String[] getCustomerNameBySamePaymentMethod(String paymentMethod) {
    System.out.println("Invoked getCustomerBySamePaymentMethod method");
    int count = 0;
    for (Customer c : this.customer) {
      if (c.getPaymentMethod().toString().equals(paymentMethod)) {
        count++;
      }
    }
    String[] custNames = new String[count];
    int customerIndex = 0;
    for (Customer c : this.customer) {
      if (c.getPaymentMethod().toString().equals(paymentMethod)) {
        custNames[customerIndex++] = c.getCustomerName();
      }
    }
    return custNames;
  }
  
  @Override
  public boolean updateCustomerEmailById(int existingId, String updateEmail) {
    System.out.println("Invoked updateCustomerEmail method");
    boolean isUpdated = false;
    if (existingId != 0 && updateEmail != null && !updateEmail.isEmpty()) {
      for (Customer c : this.customer) {
        if (c.getCustomerId() == existingId) {
          c.setEmail(updateEmail);
          isUpdated = true;
          System.out.println("Email updated successfully!");
          System.out.println(c);
        }
      }
    } else {
      System.out.println("Invalid existing Id ");
    }
    return isUpdated;
  }
  
  @Override
  public String getProductNameByCustomerName(String customerName) {
    System.out.println("Invoked getProductNameByCustomer method");
    String productName = null;
    if (customerName != null) {
      for (Customer c : this.customer) {
        if (c.getCustomerName().equals(customerName)) {
          productName = c.getProductName();
        }
      }
    } else {
      System.out.println("Invalid customer object...");
    }
    return productName;
  }
  
  @Override
  public Customer increaseProductQuantityById(int customerId, int quantityToAdd) {
    System.out.println("Invoked increaseProductQuantityById method");
    Customer cust = null;
    if (customerId != 0 && quantityToAdd != 0) {
      for (Customer c : this.customer) {
        if (c.getCustomerId() == customerId) {
          c.setProductQuantity(c.getProductQuantity() + quantityToAdd);
          cust = c;
        }
      }
    } else {
      System.out.println("Invalid customer Id OR new quantity");
    }
    return cust;
  }
}
