package com.xworkz.examapp;

import com.xworkz.examapp.exam.Exam;
import com.xworkz.examapp.exam.SupplExam;
import com.xworkz.examapp.hallticket.HallTicket;

public class ExamTester {
  public static void main(String[] args) {
    HallTicket hallTicket = new HallTicket("Mathematics", "S1815865", "Virat", "Bengaluru City University");
    Exam exam = new SupplExam(1250);
    exam.allow(hallTicket);
  }
}