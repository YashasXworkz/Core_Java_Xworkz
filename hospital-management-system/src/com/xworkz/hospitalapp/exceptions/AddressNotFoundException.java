package com.xworkz.hospitalapp.exceptions;

public class AddressNotFoundException extends Exception {
  public AddressNotFoundException(String address) {
    System.out.println("No patient found for address: " + address);
  }
}
