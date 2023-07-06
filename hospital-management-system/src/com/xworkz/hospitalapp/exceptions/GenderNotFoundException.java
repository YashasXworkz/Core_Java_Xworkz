package com.xworkz.hospitalapp.exceptions;

public class GenderNotFoundException extends Exception {
  public GenderNotFoundException(String gender) {
    System.out.println("No patient found for gender: " + gender);
  }
}
