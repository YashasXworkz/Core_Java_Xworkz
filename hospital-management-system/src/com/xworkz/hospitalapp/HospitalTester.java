package com.xworkz.hospitalapp;

import com.xworkz.hospitalapp.bloodgroup.BloodGroup;
import com.xworkz.hospitalapp.documenttype.DocumentType;
import com.xworkz.hospitalapp.gender.Gender;
import com.xworkz.hospitalapp.hospital.ApolloHospitalImpl;
import com.xworkz.hospitalapp.hospital.Hospital;
import com.xworkz.hospitalapp.isinsuranceavailable.IsInsuranceAvailable;
import com.xworkz.hospitalapp.patient.Patient;
import com.xworkz.hospitalapp.wardnumber.WardNumber;

public class HospitalTester {
  public static void main(String[] args) {
    Hospital hospital = new ApolloHospitalImpl();
    Patient patient1 = new Patient();
    
    patient1.setPatientName("Virat");
    patient1.setAge(34);
    patient1.setGender(Gender.MALE);
    patient1.setDiseaseName("Flu");
    patient1.setPhoneNumber(9765436789L);
    patient1.setBloodGroup(BloodGroup.A_NEGATIVE);
    patient1.setAddress("Rajajinagar");
    patient1.setWardNumber(WardNumber.BBlock103);
    patient1.setDocumentType(DocumentType.DL);
    patient1.setDocumentNumber("DL-0420110149646");
    patient1.setIsInsuranceAvailable(IsInsuranceAvailable.False);
    boolean verify1 = hospital.addPatient(patient1);
    System.out.println(verify1);
    
    Patient patient2 = new Patient();
    patient2.setPatientName("Priya");
    patient2.setAge(44);
    patient2.setGender(Gender.FEMALE);
    patient2.setDiseaseName("Malaria");
    patient2.setPhoneNumber(6767987659L);
    patient2.setBloodGroup(BloodGroup.O_NEGATIVE);
    patient2.setAddress("Bashyam Circle");
    patient2.setWardNumber(WardNumber.ABlock101);
    patient2.setDocumentType(DocumentType.PAN);
    patient2.setDocumentNumber("ABCTY1234D");
    patient2.setIsInsuranceAvailable(IsInsuranceAvailable.True);
    boolean verify2 = hospital.addPatient(patient2);
    System.out.println(verify2);
    
    Patient patient3 = new Patient();
    patient3.setPatientName("Raj");
    patient3.setAge(53);
    patient3.setGender(Gender.TRANSGENDER);
    patient3.setDiseaseName("Fever");
    patient3.setPhoneNumber(7965436789L);
    patient3.setBloodGroup(BloodGroup.AB_NEGATIVE);
    patient3.setAddress("Vijayanagar");
    patient3.setWardNumber(WardNumber.CBlock105);
    patient3.setDocumentType(DocumentType.Aadhaar);
    patient3.setDocumentNumber("4545-5678-3467");
    patient3.setIsInsuranceAvailable(IsInsuranceAvailable.True);
    boolean verify3 = hospital.addPatient(patient3);
    System.out.println(verify3);
    
    Patient patient4 = new Patient();
    patient4.setPatientName("Pradeep");
    patient4.setAge(27);
    patient4.setGender(Gender.MALE);
    patient4.setDiseaseName("Dengue");
    patient4.setPhoneNumber(8765438954L);
    patient4.setBloodGroup(BloodGroup.B_NEGATIVE);
    patient4.setAddress("Nagarabhavi");
    patient4.setWardNumber(WardNumber.CBlock106);
    patient4.setDocumentType(DocumentType.Aadhaar);
    patient4.setDocumentNumber("5645-8978-2367");
    patient4.setIsInsuranceAvailable(IsInsuranceAvailable.False);
    boolean verify4 = hospital.addPatient(patient4);
    System.out.println(verify4);
    
    Patient patient5 = new Patient();
    patient5.setPatientName("Sofia");
    patient5.setAge(56);
    patient5.setGender(Gender.TRANSGENDER);
    patient5.setDiseaseName("Dengue-II");
    patient5.setPhoneNumber(6545678906L);
    patient5.setBloodGroup(BloodGroup.A_POSITIVE);
    patient5.setAddress("Shantinagar");
    patient5.setWardNumber(WardNumber.BBlock104);
    patient5.setDocumentType(DocumentType.PAN);
    patient5.setDocumentNumber("ABCTY1454D");
    patient5.setIsInsuranceAvailable(IsInsuranceAvailable.False);
    boolean verify5 = hospital.addPatient(patient5);
    System.out.println(verify5);
    
    hospital.getAllPatients();
  }
}
