package com.xworkz.exceptionhandling;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionHandling {
  public static void main(String[] args) {
    System.out.println("Main method started");
    String str = null;
    String str2 = "null";
    
    try {
      System.out.println(str.equals(str2));
    } catch (NullPointerException npe) {
      System.out.println("Cannot compare the null reference 'str' to 'str2'.");
    }
    
    try {
      int x = 100 / 0;
    } catch (ArithmeticException ae) {
      System.out.println("Denominator cannot be zero while integer division");
    }
    
    int[] values = new int[5];
    System.out.println("Printing the values...");
    try {
      for (int i = 0; i < 10; i++) {
        System.out.println(values[i]);
      }
    } catch (ArrayIndexOutOfBoundsException aie) {
      System.out.println("Invalid array index. Cannot access element at index 5");
    }
    
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the number: ");
    try {
      String number = sc.next();
      Long num = Long.parseLong(number);
      System.out.println(num);
    } catch (NumberFormatException nfe) {
      System.out.println("Invalid number format. Please enter a valid number.");
    }
    
    System.out.println("Enter the phone number: ");
    try {
      Long phno = sc.nextLong();
      System.out.println(phno);
    } catch (InputMismatchException ime) {
      System.out.println("Invalid input. Please enter a valid phone number.");
    }
    
    System.out.println("Main method ended");
  }
}
