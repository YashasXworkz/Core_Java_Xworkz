package com.xworkz.polymorphism;

import com.xworkz.polymorphism.child.Child;
//import com.xworkz.polymorphism.parent.Parent;

public class Tester {
  public static void main(String[] args) {
    //Parent parent = new Child();
    Child child = new Child();
    double profit = child.business();
    //double profit = parent.business();
    System.out.println("Profit: " + profit);
  }
}