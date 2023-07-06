package com.xworkz.hospitalapp.exceptions;

public class WardNoNotFoundException extends Exception {
  public WardNoNotFoundException(String wardNumber) {
    System.out.println("No patient found for ward number: " + wardNumber);
  }
}
