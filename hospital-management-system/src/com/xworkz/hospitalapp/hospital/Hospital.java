package com.xworkz.hospitalapp.hospital;

import com.xworkz.hospitalapp.exceptions.AddressNotFoundException;
import com.xworkz.hospitalapp.exceptions.GenderNotFoundException;
import com.xworkz.hospitalapp.exceptions.WardNoNotFoundException;
import com.xworkz.hospitalapp.patient.Patient;

public interface Hospital {
  boolean addPatient(Patient patient);
  void getAllPatients();
  Patient getPatientByAddress(String address) throws AddressNotFoundException;
  String getPatientNameByWardNo(String wardNo) throws WardNoNotFoundException;
  String[] getPatientNameByDiseaseName(String diseaseName);
  boolean updatePatientDiseaseByPatientName(String existingPatientName, String updatedDiseaseName);
  boolean updatePatientWardNoByPatientId(int existingId, String updatedWardNo);
  boolean updatePatientAgeByPatientId(int existingPatientId, int UpdatedPatientAge);
  Patient getPatientById(int patientId);
  String getPatientAttenderNameByPatientId(int patientId);
  String getPatientStreetNameById(int patientId);
  Patient getPatientByGender(String gender) throws GenderNotFoundException;
}