package com.xworkz.hospitalapp;

import java.util.Scanner;

public class PatientTester {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    
    System.out.println("Enter patient id:");
    int patientId = sc.nextInt();  //1
    
    System.out.println("Enter patient name:");
    String patientName = sc.next();  //virat
    
    System.out.println("Enter patient age:");
    int age = sc.nextInt();  //34
    
    System.out.println("Enter patient phone number:");
    long phoneNumber = sc.nextLong();   //7878787878
    
    System.out.println("Is patient insurance available:");
    boolean isInsuranceAvailable = sc.nextBoolean();   //true
    
    System.out.println("Enter patient disease name:");
    String diseaseName = sc.next();  //flu
    
    Patient patient = new Patient();
    patient.setPatientId(patientId);
    patient.setPatientName(patientName);
    patient.setAge(age);
    patient.setPhoneNumber(phoneNumber);
    patient.setInsuranceAvailable(isInsuranceAvailable);
    patient.setDiseaseName(diseaseName);
    
    System.out.println(patient.getPatientId() + " " + patient.getPatientName() + " " + patient.getAge() + " " +
            patient.getPhoneNumber() + " " + patient.isInsuranceAvailable() + " " + patient.getDiseaseName());
  }
}