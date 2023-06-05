package com.xworkz.examapp.exam;

import com.xworkz.examapp.hallticket.HallTicket;

public class SupplExam extends Exam {
  public int noOfAttempts = 2;
  
  public SupplExam(int fees) {
    super(fees);
  }
  
  @Override
  public boolean allow(HallTicket ticket) {
    System.out.println("Inside allow of SupplExam");
    if (noOfAttempts > 1) {
      System.out.println("Invoking allow of Exam");
      return super.allow(ticket);
    }
    return false;
  }
}