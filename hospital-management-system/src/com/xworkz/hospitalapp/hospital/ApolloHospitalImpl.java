package com.xworkz.hospitalapp.hospital;

import com.xworkz.hospitalapp.patient.Patient;

public class ApolloHospitalImpl implements Hospital {
  Patient[] patient = new Patient[5];
  int index;
  
  @Override
  public boolean addPatient(Patient patient) {
    System.out.println("Invoked addPatient method");
    boolean isAdded = false;
    if (patient != null) {
      System.out.println("Patient check is Completed... Proceed to add the patient");
        //patient != null                  && patient != ""
      if (patient.getPatientName() != null && !patient.getPatientName().isEmpty()) {
        this.patient[index] = patient;
        index++;
        isAdded = true;
        System.out.println("Patient data added successfully");
      } else {
        System.out.println("Patient name is empty...");
      }
    } else {
      System.out.println("Patient object is null...");
    }
    return isAdded;
  }
  
  @Override
  public void getAllPatients() {
    System.out.println("Invoked getAllPatients");
    System.out.println("List of Patients are: ");
    for (Patient pat : this.patient) {
      System.out.println(pat);
    }
  }
}
