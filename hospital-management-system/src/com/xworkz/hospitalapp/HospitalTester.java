package com.xworkz.hospitalapp;

import com.xworkz.hospitalapp.enums.BloodGroup;
import com.xworkz.hospitalapp.enums.DocumentType;
import com.xworkz.hospitalapp.enums.Gender;
import com.xworkz.hospitalapp.hospital.ApolloHospitalImpl;
import com.xworkz.hospitalapp.hospital.Hospital;
import com.xworkz.hospitalapp.location.*;
import com.xworkz.hospitalapp.patient.Patient;
import com.xworkz.hospitalapp.enums.WardNumber;

import java.util.Scanner;

public class HospitalTester {
  public static void main(String[] args) {
    System.out.println("Invoked main method");
    Scanner scan = new Scanner(System.in);
    String text;
    
    System.out.println("Enter the number of patients to be added: ");
    int size = scan.nextInt();
    Hospital hospital = new ApolloHospitalImpl(size);
    for (int patientIndex = 0; patientIndex < size; patientIndex++) {
      Patient patient = new Patient();
      System.out.println("Enter patient Id: ");
      patient.setPatientId(scan.nextInt());
      System.out.println("Enter patient name: ");
      patient.setPatientName(scan.next());
      System.out.println("Enter patient age: ");
      patient.setAge(scan.nextInt());
      System.out.println("Enter patient gender: male, female, transgender, lgbt");
      patient.setGender(Gender.valueOf(scan.next().toUpperCase()));
      System.out.println("Enter patient blood group: apositive, anegative, bpositive, bnegative, abpositive, abnegative, opositive, onegative");
      patient.setBloodGroup(BloodGroup.valueOf(scan.next().toUpperCase()));
      System.out.println("Enter patient disease name: ");
      patient.setDiseaseName(scan.next());
      System.out.println("Enter phone number: ");
      patient.setPhoneNumber(scan.nextLong());
      System.out.println("Enter patient address: ");
      patient.setPatientAddress(scan.next());
      System.out.println("Enter attender name: ");
      patient.setAttenderName(scan.next());
      System.out.println("Enter ward number: a101, a102, b101, b102, c101, c102");
      patient.setWardNumber(WardNumber.valueOf(scan.next().toUpperCase()));
      System.out.println("Enter patient document type: dl, aadhaar, pan, passport, voterid, rationcard, bplcard, aplcard, employeeid");
      patient.setDocumentType(DocumentType.valueOf(scan.next().toUpperCase()));
      System.out.println("Enter document number: ");
      patient.setDocumentNumber(scan.next());
      System.out.println("Is insurance available? true/false: ");
      patient.setInsuranceAvailable(scan.nextBoolean());
      
      Street street = new Street();
      System.out.println("Enter street name: ");
      street.setStreetName(scan.next());
      Area area = new Area();
      System.out.println("Enter area name: ");
      area.setAreaName(scan.next());
      area.setStreet(street);
      
      City city = new City();
      System.out.println("Enter city name: ");
      city.setCityName(scan.next());
      city.setArea(area);
      
      State state = new State();
      System.out.println("Enter state name: ");
      state.setStateName(scan.next());
      state.setCity(city);
      
      Country country = new Country();
      System.out.println("Enter country name: ");
      country.setCountryName(scan.next());
      country.setState(state);
      
      Address address = new Address();
      address.setCountry(country);
      
      patient.setAddress(address);
      boolean addedPatient = hospital.addPatient(patient);
      System.out.println(addedPatient);
    }
    
    do {
      System.out.println("Enter your choice:\n1. Get all patient details \n2. Get patient details by address \n3. Get patient name by ward number \n4. Get patient names by disease name \n5. Update patient disease name by patient name \n6. Update patient ward number by patient Id \n7. Update patient age by patient Id \n8. Get patient details by patient Id \n9. Get attender name by patient Id \n10. Get street name by patient Id");
      int choice = scan.nextInt();
      switch (choice) {
        case 1:
          hospital.getAllPatients();
          break;
        
        case 2:
          System.out.println("Enter address to find patient details: ");
          Patient patientByAddress = hospital.getPatientByAddress(scan.next());
          System.out.println(patientByAddress);
          break;
        
        case 3:
          System.out.println("Enter ward number to find patient name: ");
          String patientNameByWardNo = hospital.getPatientNameByWardNo(scan.next().toUpperCase());
          System.out.println("Patient name: " + patientNameByWardNo);
          break;
        
        case 4:
          System.out.println("Enter disease name to find patient names: ");
          String[] patientNameByDiseaseName = hospital.getPatientNameByDiseaseName(scan.next());
          System.out.println("List of patients with the same disease name:");
          for (String patientName : patientNameByDiseaseName) {
            if (patientName != null) {
              System.out.println(patientName);
            }
          }
          break;
        
        case 5:
          System.out.println("Enter patient name and new disease name: ");
          boolean updatedPatientDiseaseByPatientName = hospital.updatePatientDiseaseByPatientName(scan.next(), scan.next());
          System.out.println(updatedPatientDiseaseByPatientName);
          break;
        
        case 6:
          System.out.println("Enter patient Id and new ward number: a101, a102, b101, b102, c101, c102");
          boolean updatedPatientWardNoByPatientId = hospital.updatePatientWardNoByPatientId(scan.nextInt(), scan.next().toUpperCase());
          System.out.println(updatedPatientWardNoByPatientId);
          break;
        
        case 7:
          System.out.println("Enter patient Id and new age: ");
          boolean updatedPatientAgeByPatientId = hospital.updatePatientAgeByPatientId(scan.nextInt(), scan.nextInt());
          System.out.println(updatedPatientAgeByPatientId);
          break;
        
        case 8:
          System.out.println("Enter patient Id to find patient details: ");
          Patient patientById = hospital.getPatientById(scan.nextInt());
          System.out.println(patientById);
          break;
        
        case 9:
          System.out.println("Enter patient Id to find attender name: ");
          String attenderNameByPatientId = hospital.getPatientAttenderNameByPatientId(scan.nextInt());
          System.out.println("Attender name: " + attenderNameByPatientId);
          break;
        
        case 10:
          System.out.println("Enter patient Id to find street name: ");
          String patientStreetNameById = hospital.getPatientStreetNameById(scan.nextInt());
          System.out.println("Street name: " + patientStreetNameById);
          break;
        
        default:
          System.out.println("Enter valid choice!");
      }
      System.out.println("Do you want to continue: y/n");
      text = scan.next();
    } while (text.equals("y"));
  }
}
