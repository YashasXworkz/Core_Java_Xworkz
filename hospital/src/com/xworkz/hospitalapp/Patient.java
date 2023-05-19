package com.xworkz.hospitalapp;

public class Patient {
  private int patientId;
  private String patientName;
  private int age;
  private long phoneNumber;
  private boolean isInsuranceAvailable;
  private String diseaseName;
  
  public int getPatientId() {
    return patientId;
  }
  
  public void setPatientId(int patientId) {
    this.patientId = patientId;
  }
  
  public String getPatientName() {
    return patientName;
  }
  
  public void setPatientName(String patientName) {
    this.patientName = patientName;
  }
  
  public int getAge() {
    return age;
  }
  
  public void setAge(int age) {
    this.age = age;
  }
  
  public long getPhoneNumber() {
    return phoneNumber;
  }
  
  public void setPhoneNumber(long phoneNumber) {
    this.phoneNumber = phoneNumber;
  }
  
  public boolean isInsuranceAvailable() {
    return isInsuranceAvailable;
  }
  
  public void setInsuranceAvailable(boolean insuranceAvailable) {
    isInsuranceAvailable = insuranceAvailable;
  }
  
  public String getDiseaseName() {
    return diseaseName;
  }
  
  public void setDiseaseName(String diseaseName) {
    this.diseaseName = diseaseName;
  }
}
