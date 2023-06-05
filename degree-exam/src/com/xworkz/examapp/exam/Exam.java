package com.xworkz.examapp.exam;

import com.xworkz.examapp.hallticket.HallTicket;

public class Exam {
  public HallTicket ticket;
  private final int fees;
  
  public Exam(int fees) {
    this.fees = fees;
  }
  
  public boolean allow(HallTicket ticket) {
    boolean isAllowed = false;
    System.out.println("Invoking allow method");
    if (fees == 1250) {
      System.out.println("Fees Paid: Issuing HallTicket...");
      if (ticket != null) {
        this.ticket = ticket;
        System.out.println("Hall Ticket is issued... All the best!");
        isAllowed = true;
        this.ticket.displayDetails();
      } else {
        System.out.println("Hall Ticket not found!");
      }
    } else {
      System.out.println("First pay the fees!");
    }
    return isAllowed;
  }
}