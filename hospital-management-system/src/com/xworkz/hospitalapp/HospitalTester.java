package com.xworkz.hospitalapp;

import com.xworkz.hospitalapp.bloodgroup.BloodGroup;
import com.xworkz.hospitalapp.documenttype.DocumentType;
import com.xworkz.hospitalapp.gender.Gender;
import com.xworkz.hospitalapp.hospital.ApolloHospitalImpl;
import com.xworkz.hospitalapp.hospital.Hospital;
import com.xworkz.hospitalapp.isinsuranceavailable.IsInsuranceAvailable;
import com.xworkz.hospitalapp.patient.Patient;
import com.xworkz.hospitalapp.wardnumber.WardNumber;

import java.util.Scanner;

public class HospitalTester {
  public static void main(String[] args) {
    Hospital hospital = new ApolloHospitalImpl(5);
    Patient patient1 = new Patient();

    patient1.setPatientId(1);
    patient1.setPatientName("virat");
    patient1.setAge(34);
    patient1.setGender(Gender.male);
    patient1.setDiseaseName("flu");
    patient1.setPhoneNumber(9765436789L);
    patient1.setBloodGroup(BloodGroup.aneg);
    patient1.setAddress("rrnagar");
    patient1.setWardNumber(WardNumber.a101);
    patient1.setDocumentType(DocumentType.dl);
    patient1.setDocumentNumber("DL-0420110149646");
    patient1.setIsInsuranceAvailable(IsInsuranceAvailable.False);
    boolean verify1 = hospital.addPatient(patient1);
    System.out.println(verify1);

    Patient patient2 = new Patient();
    patient2.setPatientId(2);
    patient2.setPatientName("priya");
    patient2.setAge(44);
    patient2.setGender(Gender.female);
    patient2.setDiseaseName("malaria");
    patient2.setPhoneNumber(6767987659L);
    patient2.setBloodGroup(BloodGroup.oneg);
    patient2.setAddress("bashyamcircle");
    patient2.setWardNumber(WardNumber.b101);
    patient2.setDocumentType(DocumentType.pan);
    patient2.setDocumentNumber("ABCTY1234D");
    patient2.setIsInsuranceAvailable(IsInsuranceAvailable.True);
    boolean verify2 = hospital.addPatient(patient2);
    System.out.println(verify2);

    Patient patient3 = new Patient();
    patient3.setPatientId(3);
    patient3.setPatientName("raj");
    patient3.setAge(53);
    patient3.setGender(Gender.transgender);
    patient3.setDiseaseName("fever");
    patient3.setPhoneNumber(7965436789L);
    patient3.setBloodGroup(BloodGroup.abneg);
    patient3.setAddress("vijayanagar");
    patient3.setWardNumber(WardNumber.c101);
    patient3.setDocumentType(DocumentType.aadhaar);
    patient3.setDocumentNumber("4545-5678-3467");
    patient3.setIsInsuranceAvailable(IsInsuranceAvailable.True);
    boolean verify3 = hospital.addPatient(patient3);
    System.out.println(verify3);

    Patient patient4 = new Patient();
    patient4.setPatientId(4);
    patient4.setPatientName("pradeep");
    patient4.setAge(27);
    patient4.setGender(Gender.male);
    patient4.setDiseaseName("dengue");
    patient4.setPhoneNumber(8765438954L);
    patient4.setBloodGroup(BloodGroup.bneg);
    patient4.setAddress("nagarabhavi");
    patient4.setWardNumber(WardNumber.c102);
    patient4.setDocumentType(DocumentType.aadhaar);
    patient4.setDocumentNumber("5645-8978-2367");
    patient4.setIsInsuranceAvailable(IsInsuranceAvailable.False);
    boolean verify4 = hospital.addPatient(patient4);
    System.out.println(verify4);

    Patient patient5 = new Patient();
    patient5.setPatientId(5);
    patient5.setPatientName("sofia");
    patient5.setAge(56);
    patient5.setGender(Gender.transgender);
    patient5.setDiseaseName("dengue-II");
    patient5.setPhoneNumber(6545678906L);
    patient5.setBloodGroup(BloodGroup.abneg);
    patient5.setAddress("shantinagar");
    patient5.setWardNumber(WardNumber.b102);
    patient5.setDocumentType(DocumentType.pan);
    patient5.setDocumentNumber("ABCTY1454D");
    patient5.setIsInsuranceAvailable(IsInsuranceAvailable.False);
    boolean verify5 = hospital.addPatient(patient5);
    System.out.println(verify5);

    hospital.getAllPatients();
    
    Scanner scan = new Scanner(System.in);
    //System.out.println("Enter the patient size to be added: ");
    //int size = scan.nextInt();
    //Hospital hospital = new ApolloHospitalImpl(size);
    //
    //for (int patientIndex = 0; patientIndex < size; patientIndex++) {
    //  Patient patient = new Patient();
    //  System.out.println("Enter patient id: ");
    //  patient.setPatientId(scan.nextInt());
    //  System.out.println("Enter patient name: ");
    //  patient.setPatientName(scan.next());
    //  System.out.println("Enter patient gender: ");
    //  patient.setGender(Gender.valueOf(scan.next()));
    //  System.out.println("Enter patient age: ");
    //  patient.setAge(scan.nextInt());
    //  System.out.println("Enter patient blood group: apos, aneg, bpos, bneg, abpos, abneg, opos, onega");
    //  patient.setBloodGroup(BloodGroup.valueOf(scan.next()));
    //  System.out.println("Enter patient disease name: ");
    //  patient.setDiseaseName(scan.next());
    //  System.out.println("Enter phone number: ");
    //  patient.setPhoneNumber(scan.nextLong());
    //  System.out.println("Enter patient address: ");
    //  patient.setAddress(scan.next());
    //  System.out.println("Enter ward no: a101, a102, b101, b102, c101, c102");
    //  patient.setWardNumber(WardNumber.valueOf(scan.next()));
    //  System.out.println("Enter patient document type: dl, aadhaar, pan, passport, voterid, rationcard, bplcard, aplcard, employeeid");
    //  patient.setDocumentType(DocumentType.valueOf(scan.next()));
    //  System.out.println("Enter document no: ");
    //  patient.setDocumentNumber(scan.next());
    //  System.out.println("Enter insurance available? True/False: ");
    //  patient.setIsInsuranceAvailable(IsInsuranceAvailable.valueOf(scan.next()));
    //  hospital.addPatient(patient);
    //}
    //hospital.getAllPatients();
    System.out.println("Enter address to find patient details: ");
    hospital.getPatientByAddress(scan.next());
    
    System.out.println("Enter ward no to find patient name: ");
    hospital.getPatientNameByWardNo(WardNumber.valueOf(scan.next()).toString());

    System.out.println("Enter disease name to find patient names: ");
    hospital.getPatientNameByDiseaseName(scan.next());

    System.out.println("Enter patient name & new disease name both: ");
    hospital.updatePatientDiseaseByPatientName(scan.next(), scan.next());

    System.out.println("Enter patient id to update and Enter new ward no: a101, a102, b101, b102, c101, c102");
    hospital.updatePatientWardNoByPatientId(scan.nextInt(), WardNumber.valueOf(scan.next()).toString());
  }
}
