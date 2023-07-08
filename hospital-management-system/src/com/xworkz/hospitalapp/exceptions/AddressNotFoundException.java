package com.xworkz.hospitalapp.exceptions;

public class AddressNotFoundException extends Exception {
  public AddressNotFoundException(String address) {
    System.out.println("No patient found for address: " + address);
  }
  
  /*@Override
  public String getMessage() {
    return "No patient found for address";
  }
  
  @Override
  public String toString() {
    return "No patient found for address";
  }*/
}
