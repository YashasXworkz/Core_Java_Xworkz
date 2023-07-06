package com.xworkz.hospitalapp.hospital;

import com.xworkz.hospitalapp.exceptions.*;
import com.xworkz.hospitalapp.patient.Patient;
import com.xworkz.hospitalapp.enums.*;

import java.util.Arrays;

public class ApolloHospitalImpl implements Hospital {
  Patient[] patient;
  int index;
  
  public ApolloHospitalImpl(int size) {
    patient = new Patient[size];
  }
  
  @Override
  public boolean addPatient(Patient patient) {
    System.out.println("Invoked addPatient method");
    boolean isAdded = false;
    if (patient != null) {
      System.out.println("Patient check is completed... Proceeding to add the patient");
      //patient != null                    && patient != ""
      if (patient.getPatientName() != null && !patient.getPatientName().isEmpty()) {
        this.patient[index++] = patient;
        isAdded = true;
        System.out.println("Patient data added successfully!");
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
    System.out.println("Invoked getAllPatients method");
    System.out.println("List of Patients:");
    for (Patient pat : this.patient) {
      System.out.println(pat);
    }
  }
  
  @Override
  public Patient getPatientByAddress(String address) throws AddressNotFoundException {
    System.out.println("Invoked getPatientByAddress method");
    Patient pat = null;
    if (address != null && !address.isEmpty()) {
      for (Patient p : this.patient) {
        if (p.getPatientAddress().equals(address)) {
          pat = p;
        }
      }
    } else {
      System.out.println("Invalid address");
    }
    if (pat == null) {
      throw new AddressNotFoundException(address);
    }
    return pat;
  }
  
  @Override
  public String getPatientNameByWardNo(String wardNumber) throws WardNoNotFoundException {
    System.out.println("Invoked getPatientNameByWardNo method");
    String patientName = null;
    if (wardNumber != null && !wardNumber.isEmpty()) {
      for (Patient p : this.patient) {
        if (p.getWardNumber().toString().equals(wardNumber)) {
          patientName = p.getPatientName();
        }
      }
    } else {
      System.out.println("Ward number is null OR empty!");
    }
    if (patientName == null) {
      throw new WardNoNotFoundException(wardNumber);
    }
    return patientName;
  }
  
  @Override
  public String[] getPatientNameByDiseaseName(String diseaseName) {
    System.out.println("Invoked getPatientNameByDiseaseName method");
    /*int count = 0;
    for (Patient p : this.patient) {
      if (p.getDiseaseName().equals(diseaseName)) {
        count++;
      }
    }
    String[] patientNames = new String[count];
    int patientIndex = 0;
    for (Patient p : this.patient) {
      if (p.getDiseaseName().equals(diseaseName)) {
        patientNames[patientIndex++] = p.getPatientName();
      }
    }
    return patientNames;*/
    int patientIndex = 0;
    String[] patientNames = new String[0];
    if (diseaseName != null && !diseaseName.isEmpty()) {
      for (Patient p : this.patient) {
        if (p.getDiseaseName().equals(diseaseName)) {
          patientNames = Arrays.copyOf(patientNames, patientNames.length + 1);
          patientNames[patientIndex++] = p.getPatientName();
        }
      }
    } else {
      System.out.println("Disease name is null OR empty");
    }
    if (patientNames.length == 0) {
      throw new SameDiseasePatientsNotFoundException(diseaseName);
    }
    return patientNames;
  }
  
  @Override
  public boolean updatePatientDiseaseByPatientName(String existingPatientName, String updatedDiseaseName) {
    System.out.println("Invoked updatePatientDiseaseByPatientName method");
    boolean isUpdated = false;
    if (existingPatientName != null && !existingPatientName.isEmpty() && updatedDiseaseName != null && !updatedDiseaseName.isEmpty()) {
      for (Patient p : this.patient) {
        if (p.getPatientName().equals(existingPatientName)) {
          p.setDiseaseName(updatedDiseaseName);
          isUpdated = true;
          System.out.println("Patient disease updated successfully!");
          System.out.println(p);
        }
      }
    } else {
      System.out.println("Invalid patient name OR updated disease name");
    }
    return isUpdated;
  }
  
  @Override
  public boolean updatePatientWardNoByPatientId(int existingPatientId, String updatedWardNumber) {
    System.out.println("Invoked updatePatientWardNoByPatientId method");
    boolean isUpdated = false;
    if (existingPatientId != 0 && updatedWardNumber != null && !updatedWardNumber.isEmpty()) {
      for (Patient p : this.patient) {
        if (p.getPatientId() == existingPatientId) {
          p.setWardNumber(WardNumber.valueOf(updatedWardNumber));
          isUpdated = true;
          System.out.println("Patient ward number updated successfully!");
          System.out.println(p);
        }
      }
    } else {
      System.out.println("Invalid existing Id OR updated ward number");
    }
    return isUpdated;
  }
  
  @Override
  public boolean updatePatientAgeByPatientId(int existingPatientId, int updatedPatientAge) {
    System.out.println("Invoked updatePatientAgeByPatientId method");
    boolean isUpdated = false;
    if (existingPatientId != 0 && updatedPatientAge != 0) {
      for (Patient p : this.patient) {
        if (p.getPatientId() == existingPatientId) {
          p.setAge(updatedPatientAge);
          isUpdated = true;
          System.out.println("Patient age updated successfully!");
          System.out.println(p);
        }
      }
    } else {
      System.out.println("Invalid patient Id OR updated patient aga");
    }
    return isUpdated;
  }
  
  @Override
  public Patient getPatientById(int patientId) {
    System.out.println("Invoked getPatientById method");
    Patient pat = null;
    if (patientId != 0) {
      for (Patient p : this.patient) {
        if (p.getPatientId() == patientId) {
          pat = p;
        }
      }
    } else {
      System.out.println("Invalid patient Id");
    }
    if (pat == null) {
      throw new PatientNotFoundException(patientId);
    }
    return pat;
  }
  
  
  @Override
  public String getPatientAttenderNameByPatientId(int patientId) {
    System.out.println("Invoked getPatientAttenderNameByPatientId method");
    String attenderName = null;
    if (patientId != 0) {
      for (Patient p : this.patient) {
        if (p.getPatientId() == patientId) {
          attenderName = p.getAttenderName();
        }
      }
    } else {
      System.out.println("Patient Id is zero");
    }
    if (attenderName == null) {
      throw new AttenderNotFoundException(patientId);
    }
    return attenderName;
  }
  
  
  @Override
  public String getPatientStreetNameById(int patientId) {
    System.out.println("Invoked getPatientStreetNameById method");
    String streetName = null;
    if (patientId != 0) {
      for (Patient p : this.patient) {
        if (p.getPatientId() == patientId) {
          streetName = p.getAddress().getCountry().getState().getCity().getArea().getStreet().getStreetName();
        }
      }
    } else {
      System.out.println("Patient Id is zero");
    }
    if (streetName == null) {
      throw new StreetNotFoundException(patientId);
    }
    return streetName;
  }
  
  @Override
  public Patient getPatientByGender(String gender) throws GenderNotFoundException {
    System.out.println("Invoked getPatientByGender method");
    Patient pat = null;
    if (gender != null && !gender.isEmpty()) {
      for (Patient p : this.patient) {
        if (p.getGender().toString().equals(gender)) {
          pat = p;
        }
      }
    } else {
      System.out.println("Gender is null OR empty");
    }
    if (pat == null) {
      throw new GenderNotFoundException(gender);
    }
    return pat;
  }
}
