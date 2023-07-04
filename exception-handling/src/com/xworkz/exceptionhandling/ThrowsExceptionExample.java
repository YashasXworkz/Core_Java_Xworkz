package com.xworkz.exceptionhandling;

public class ThrowsExceptionExample {
  public static void main(String[] args) {
    System.out.println("main method started");
    method1();
    /*try {
      method1();
    } catch (NumberFormatException nfe) {
      System.out.println("Catch block executed");
    }*/
    System.out.println("main method ended");
  }
  
  private static void method1() throws NumberFormatException {
    System.out.println("method1 started");
    method2();
    System.out.println("method1 ended");
  }
  
  private static void method2() throws NumberFormatException {
    System.out.println("method2 started");
    method3();
    System.out.println("method2 ended");
  }
  
  private static void method3() throws NumberFormatException {
    System.out.println("method3 started");
    /*String phNo = "757575G";
    Integer i = Integer.parseInt(phNo);
    System.out.println("Successfully convert String to Integer: " + i);*/
    String phNo = "G";
    try {
      Integer i = Integer.parseInt(phNo);
      System.out.println(i);
    } catch (NumberFormatException nfe) {
      System.out.println("Catch block is executed");
    }
    System.out.println("method3 ended");
  }
}
