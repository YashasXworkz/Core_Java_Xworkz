package com.xworkz.hospitalapp;

public class Patient {
  int patientId;
  String patientName;
  int age;

  Patient(int patientId, String patientName, int age) {
    this.patientId = patientId;
    this.patientName = patientName;
    this.age = age;
  }
}