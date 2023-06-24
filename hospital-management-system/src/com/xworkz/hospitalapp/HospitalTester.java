package com.xworkz.hospitalapp;

import com.xworkz.hospitalapp.bloodgroup.BloodGroup;
import com.xworkz.hospitalapp.documenttype.DocumentType;
import com.xworkz.hospitalapp.gender.Gender;
import com.xworkz.hospitalapp.hospital.ApolloHospitalImpl;
import com.xworkz.hospitalapp.hospital.Hospital;
import com.xworkz.hospitalapp.isinsuranceavailable.IsInsuranceAvailable;
import com.xworkz.hospitalapp.location.*;
import com.xworkz.hospitalapp.patient.Patient;
import com.xworkz.hospitalapp.wardnumber.WardNumber;

import java.util.Scanner;

public class HospitalTester {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    System.out.println("Enter the patient size to be added: ");
    int size = scan.nextInt();
    Hospital hospital = new ApolloHospitalImpl(size);
    
    for (int patientIndex = 0; patientIndex < size; patientIndex++) {
      Patient patient = new Patient();
      System.out.println("Enter patient id: ");
      patient.setPatientId(scan.nextInt());
      System.out.println("Enter patient name: ");
      patient.setPatientName(scan.next());
      System.out.println("Enter patient gender: ");
      patient.setGender(Gender.valueOf(scan.next()));
      System.out.println("Enter patient age: ");
      patient.setAge(scan.nextInt());
      System.out.println("Enter patient blood group: apos, aneg, bpos, bneg, abpos, abneg, opos, oneg");
      patient.setBloodGroup(BloodGroup.valueOf(scan.next()));
      System.out.println("Enter patient disease name: ");
      patient.setDiseaseName(scan.next());
      System.out.println("Enter phone number: ");
      patient.setPhoneNumber(scan.nextLong());
      System.out.println("Enter patient address: ");
      patient.setPatientAddress(scan.next());
      System.out.println("Enter attender name: ");
      patient.setAttenderName(scan.next());
      System.out.println("Enter ward no: a101, a102, b101, b102, c101, c102");
      patient.setWardNumber(WardNumber.valueOf(scan.next()));
      System.out.println("Enter patient document Type: dl, aadhaar, pan, passport, voterid, rationcard, bplcard, aplcard, employeeid");
      patient.setDocumentType(DocumentType.valueOf(scan.next()));
      System.out.println("Enter document Number: ");
      patient.setDocumentNumber(scan.next());
      System.out.println("Enter insurance available? True/False: ");
      patient.setIsInsuranceAvailable(IsInsuranceAvailable.valueOf(scan.next()));
      
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
    hospital.getAllPatients();
    
    System.out.println("Enter address to find patient details: ");
    Patient patientByAddress = hospital.getPatientByAddress(scan.next());
    System.out.println(patientByAddress);
    
    System.out.println("Enter ward no to find patient name: ");
    String patientNameByWardNo = hospital.getPatientNameByWardNo(WardNumber.valueOf(scan.next()).toString());
    System.out.println(patientNameByWardNo);
    
    System.out.println("Enter disease name to find patient names: ");
    String[] patientNameByDiseaseName = hospital.getPatientNameByDiseaseName(scan.next());
    for (String patientName : patientNameByDiseaseName) {
      if (patientName != null) {
        System.out.println(patientName);
      }
    }
    
    System.out.println("Enter patient name to update disease name & enter new disease name both: ");
    boolean updatedPatientDiseaseByPatientName = hospital.updatePatientDiseaseByPatientName(scan.next(), scan.next());
    System.out.println(updatedPatientDiseaseByPatientName);
    
    System.out.println("Enter id to update ward no & enter new ward no: a101, a102, b101, b102, c101, c102");
    boolean updatedPatientWardNoByPatientId = hospital.updatePatientWardNoByPatientId(scan.nextInt(), WardNumber.valueOf(scan.next()).toString());
    System.out.println(updatedPatientWardNoByPatientId);
    
    System.out.println("Enter id to update age & enter new patient age: ");
    boolean updatedPatientAgeByPatientId = hospital.updatePatientAgeByPatientId(scan.nextInt(), scan.nextInt());
    System.out.println(updatedPatientAgeByPatientId);
    
    System.out.println("Enter id to find patient details: ");
    Patient patientById = hospital.getPatientById(scan.nextInt());
    System.out.println(patientById);
    
    System.out.println("Enter id to find attender name: ");
    String attenderNameByPatientId = hospital.getPatientAttenderNameByPatientId(scan.nextInt());
    System.out.println(attenderNameByPatientId);
    
    System.out.println("Enter id to find street name: ");
    String patientStreetNameById = hospital.getPatientStreetNameById(scan.nextInt());
    System.out.println(patientStreetNameById);
  }
}