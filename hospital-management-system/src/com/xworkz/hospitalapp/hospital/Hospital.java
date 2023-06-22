package com.xworkz.hospitalapp.hospital;

import com.xworkz.hospitalapp.patient.Patient;

public interface Hospital {
  boolean addPatient(Patient patient);
  void getAllPatients();
  Patient getPatientByAddress(String address);
  String getPatientNameByWardNo(String wardNo);
  String[] getPatientNameByDiseaseName(String diseaseName);
  boolean updatePatientDiseaseByPatientName(String existingPatientName, String updatedDiseaseName);
  boolean updatePatientWardNoByPatientId(int existingId, String updatedWardNo);
}
