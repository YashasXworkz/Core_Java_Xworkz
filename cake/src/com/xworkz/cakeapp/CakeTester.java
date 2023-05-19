package com.xworkz.cakeapp;

import java.util.Scanner;

public class CakeTester {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    
    System.out.println("Enter cake id:");
    int cakeId = sc.nextInt();  //1
    
    System.out.println("Enter cake color:");
    String colour = sc.next();  //White
    
    System.out.println("Enter cake shape:");
    String shape = sc.next();  //Round
    
    System.out.println("Enter cake flavor:");
    String flavor = sc.next();  //Vanilla
    
    System.out.println("Enter cake price");
    double cakePrice = sc.nextDouble();  //699.99
    
    Cake cake = new Cake();
    cake.setCakeId(cakeId);
    cake.setColor(colour);
    cake.setShape(shape);
    cake.setFlavor(flavor);
    cake.setPrice(cakePrice);
    
    System.out.println("Cake ID: " + cake.getCakeId() + "\nColour: " + cake.getColor() + "\nShape: " + cake.getShape()
            + "\nFlavor: " + cake.getFlavor() + "\nPrice in Rs: " + cake.getPrice());
  }
}
