package com.xworkz.hospitalapp.exceptions;

public class PatientNotFoundException extends RuntimeException{
  public PatientNotFoundException(String diseaseName) {
    System.out.println("No patient for disease: " + diseaseName);
  }
}
