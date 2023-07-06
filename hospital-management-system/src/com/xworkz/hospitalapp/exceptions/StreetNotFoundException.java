package com.xworkz.hospitalapp.exceptions;

public class StreetNotFoundException extends RuntimeException{
  public StreetNotFoundException(int patientId) {
    System.out.println("No street found for patient id: " + patientId);
  }
}
