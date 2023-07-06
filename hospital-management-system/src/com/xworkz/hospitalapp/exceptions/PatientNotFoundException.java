package com.xworkz.hospitalapp.exceptions;

public class PatientNotFoundException extends RuntimeException {
  public PatientNotFoundException(int patientId) {
    System.out.println("No patient found for Id: " + patientId);
  }
}
