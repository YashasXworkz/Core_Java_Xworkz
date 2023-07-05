package com.xworkz.hospitalapp;

import com.xworkz.hospitalapp.enums.*;
import com.xworkz.hospitalapp.exceptions.AttenderNotFoundException;
import com.xworkz.hospitalapp.exceptions.PatientNotFoundException;
import com.xworkz.hospitalapp.exceptions.WardNoNotFoundException;
import com.xworkz.hospitalapp.hospital.ApolloHospitalImpl;
import com.xworkz.hospitalapp.hospital.Hospital;
import com.xworkz.hospitalapp.location.*;
import com.xworkz.hospitalapp.patient.Patient;

import java.util.InputMismatchException;
import java.util.Scanner;

public class HospitalTester {
  public static void main(String[] args) {
    System.out.println("Invoked main method");
    Scanner sc = new Scanner(System.in);
    
    System.out.println("Enter the number of patients to be added: ");
    int size = sc.nextInt();
    Hospital hospital = new ApolloHospitalImpl(size);
    
    for (int patientIndex = 0; patientIndex < size; patientIndex++) {
      try {
        Patient patient = new Patient();
        System.out.println("Enter patient Id: ");
        patient.setPatientId(sc.nextInt());
        System.out.println("Enter patient name: ");
        patient.setPatientName(sc.next());
        System.out.println("Enter patient age: ");
        patient.setAge(sc.nextInt());
        System.out.println("Enter patient gender: male, female, transgender, lgbt");
        patient.setGender(Gender.valueOf(sc.next().toUpperCase()));
        System.out.println("Enter patient blood group: apositive, anegative, bpositive, bnegative, abpositive, abnegative, opositive, onegative");
        patient.setBloodGroup(BloodGroup.valueOf(sc.next().toUpperCase()));
        System.out.println("Enter patient disease name: ");
        patient.setDiseaseName(sc.next());
        System.out.println("Enter phone number: ");
        patient.setPhoneNumber(sc.nextLong());
        System.out.println("Enter patient address: ");
        patient.setPatientAddress(sc.next());
        System.out.println("Enter attender name: ");
        patient.setAttenderName(sc.next());
        System.out.println("Enter ward number: a101, a102, b101, b102, c101, c102");
        patient.setWardNumber(WardNumber.valueOf(sc.next().toUpperCase()));
        System.out.println("Enter patient document type: dl, aadhaar, pan, passport, voterid, rationcard, bplcard, aplcard, employeeid");
        patient.setDocumentType(DocumentType.valueOf(sc.next().toUpperCase()));
        System.out.println("Enter document number: ");
        patient.setDocumentNumber(sc.next());
        System.out.println("Is insurance available? true/false: ");
        patient.setInsuranceAvailable(sc.nextBoolean());
        
        Street street = new Street();
        Area area = new Area();
        City city = new City();
        State state = new State();
        Country country = new Country();
        Address address = new Address();
        
        System.out.println("Enter street name: ");
        street.setStreetName(sc.next());
        
        System.out.println("Enter area name: ");
        area.setAreaName(sc.next());
        area.setStreet(street);
        
        city.setCityName("bangalore");
        city.setArea(area);
        
        state.setStateName("karnataka");
        state.setCity(city);
        
        country.setCountryName("india");
        country.setState(state);
        
        address.setCountry(country);
        
        patient.setAddress(address);
        boolean addedPatient = hospital.addPatient(patient);
        System.out.println(addedPatient);
      } catch (IllegalArgumentException | InputMismatchException e) {
        System.out.println("Error occurred while adding patient: " + e);
      }
    }
    
    
    String text;
    do {
      System.out.println("""
          Enter your choice:
          1. Get all patient details
          2. Get patient details by address
          3. Get patient name by ward number
          4. Get patient names by disease name
          5. Update patient disease name by patient name
          6. Update patient ward number by patient Id
          7. Update patient age by patient Id
          8. Get patient details by patient Id
          9. Get attender name by patient Id
          10. Get street name by patient Id""");
      
      try {
        int choice = sc.nextInt();
        switch (choice) {
          case 1 -> hospital.getAllPatients();
          case 2 -> {
            System.out.println("Enter address to find patient details: ");
            Patient patientByAddress = hospital.getPatientByAddress(sc.next());
            System.out.println(patientByAddress);
          }
          case 3 -> {
            System.out.println("Enter ward number to find patient name: ");
            try {
              String patientNameByWardNo = hospital.getPatientNameByWardNo(sc.next().toUpperCase());
              System.out.println("Patient name: " + patientNameByWardNo);
            } catch (WardNoNotFoundException wnfe) {
              wnfe.printStackTrace();
            }
          }
          case 4 -> {
            System.out.println("Enter disease name to find patient names: ");
            try {
              String[] patientNameByDiseaseName = hospital.getPatientNameByDiseaseName(sc.next());
              System.out.println("List of patients with the same disease name:");
              for (String patientName : patientNameByDiseaseName) {
                if (patientName != null) {
                  System.out.println(patientName);
                }
              }
            } catch (PatientNotFoundException pnfe) {
              pnfe.printStackTrace();
            }
          }
          case 5 -> {
            System.out.println("Enter patient name and new disease name: ");
            boolean updatedPatientDiseaseByPatientName = hospital.updatePatientDiseaseByPatientName(sc.next(), sc.next());
            System.out.println(updatedPatientDiseaseByPatientName);
          }
          case 6 -> {
            System.out.println("Enter patient Id and new ward number: a101, a102, b101, b102, c101, c102");
            boolean updatedPatientWardNoByPatientId = hospital.updatePatientWardNoByPatientId(sc.nextInt(), sc.next().toUpperCase());
            System.out.println(updatedPatientWardNoByPatientId);
          }
          case 7 -> {
            System.out.println("Enter patient Id and new age: ");
            boolean updatedPatientAgeByPatientId = hospital.updatePatientAgeByPatientId(sc.nextInt(), sc.nextInt());
            System.out.println(updatedPatientAgeByPatientId);
          }
          case 8 -> {
            System.out.println("Enter patient Id to find patient details: ");
            Patient patientById = hospital.getPatientById(sc.nextInt());
            System.out.println(patientById);
          }
          case 9 -> {
            System.out.println("Enter patient Id to find attender name: ");
            try {
              String attenderNameByPatientId = hospital.getPatientAttenderNameByPatientId(sc.nextInt());
              System.out.println("Attender name: " + attenderNameByPatientId);
            } catch (AttenderNotFoundException anfe) {
              anfe.printStackTrace();
            }
          }
          case 10 -> {
            System.out.println("Enter patient Id to find street name: ");
            String patientStreetNameById = hospital.getPatientStreetNameById(sc.nextInt());
            System.out.println("Street name: " + patientStreetNameById);
          }
          default -> System.out.println("Invalid choice!");
        }
      } catch (InputMismatchException ime) {
        System.out.println("Invalid input. Existing...");
        break;
      }
      System.out.println("Do you want to continue: y/n");
      text = sc.next();
    } while (text.equals("y"));
  }
}
