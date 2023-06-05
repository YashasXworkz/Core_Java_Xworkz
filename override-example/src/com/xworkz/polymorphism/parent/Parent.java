package com.xworkz.polymorphism.parent;

public class Parent {
   int i;
   
   public Parent() {
   }
   
   public Parent(int i) {
     this.i = i;
     System.out.println("Parent Object is created");
   }
  
  //public Parent() {
  //  System.out.println("Parent Object is created");
  //}
  
  public double business() {
    System.out.println("Parent business");
    return 100.0;
  }
}