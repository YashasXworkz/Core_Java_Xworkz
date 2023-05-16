package com.xworkz.hospitalapp;

public class PatientTester {

  public static void main(String[] args) {
    Patient patient = new Patient(1, "Virat", 55);
    System.out.println(patient.patientId + " " + patient.patientName + " " + patient.age);
  }
}