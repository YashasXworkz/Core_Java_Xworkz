package com.xworkz.hospitalapp.exceptions;

public class WardNoNotFoundException extends RuntimeException {
  public WardNoNotFoundException(String wardNumber) {
    System.out.println("No patient for ward number like: " + wardNumber);
  }
}
