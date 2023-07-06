package com.xworkz.hospitalapp.exceptions;

public class AttenderNotFoundException extends RuntimeException {
  public AttenderNotFoundException(int patientId) {
    System.out.println("No attender found for patient id: " + patientId);
  }
}
