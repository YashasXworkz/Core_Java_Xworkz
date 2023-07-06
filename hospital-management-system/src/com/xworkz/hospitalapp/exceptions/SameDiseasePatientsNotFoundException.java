package com.xworkz.hospitalapp.exceptions;

public class SameDiseasePatientsNotFoundException extends RuntimeException{
  public SameDiseasePatientsNotFoundException(String diseaseName) {
    System.out.println("No patient found for disease: " + diseaseName);
  }
}
