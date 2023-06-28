package com.xworkz.exceptionhandling;

public class ExceptionHandling {
  public static void main(String[] args) {
    System.out.println("Main method started");
    String str = null;
    String str2 = "null";
    
    try {
      System.out.println(str.equals(str2));
    } catch (NullPointerException npe) {
      System.out.println("Cannot access null ref str");
    }
    
    try {
      int x = 100 / 0;
    } catch (ArithmeticException ae) {
      System.out.println("Denominator cannot be zero while integer division");
    }
    
    System.out.println("Main method ended");
  }
}
