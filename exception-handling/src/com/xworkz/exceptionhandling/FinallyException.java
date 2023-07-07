package com.xworkz.exceptionhandling;

import java.util.*;

public class FinallyException {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    try {
      String str = "1234G";
      Integer.parseInt(str);
      String str1 = null;
      System.out.println(str1.length());
    } catch (NumberFormatException | NullPointerException e) {
      e.printStackTrace();
    } finally {
      System.out.println("finally block is used to close all the costly resources");
      if (sc != null) {
        sc.close();
      }
    }
  }
}
