package com.xworkz.examapp.hallticket;

public class HallTicket {
  private final String subjectName;
  private final String rollNo;
  private final String candidateName;
  private final String universityName;
  
  public HallTicket(String subjectName, String rollNo, String candidateName, String universityName) {
    this.subjectName = subjectName;
    this.rollNo = rollNo;
    this.candidateName = candidateName;
    this.universityName = universityName;
  }
  
  public String getSubjectName() {
    return subjectName;
  }
  
  public String getRollNo() {
    return rollNo;
  }
  
  public String getCandidateName() {
    return candidateName;
  }
  
  public String getUniversityName() {
    return universityName;
  }
  
  public void displayDetails() {
    System.out.println("Hall Ticket Details:");
    System.out.println("Candidate: " + getCandidateName());
    System.out.println("Register No: " + getRollNo());
    System.out.println("Subject: " + getSubjectName());
    System.out.println("University: " + getUniversityName());
  }
}