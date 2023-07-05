package com.xworkz.hospitalapp.exceptions;

public class AttenderNotFoundException extends RuntimeException {
  public AttenderNotFoundException(int patientId) {
    System.out.println("No attender for patient id: " + patientId);
  }
}
