package com.xworkz.chatapp;

import java.util.Scanner;

public class TeaShopTester {
  public static void main(String[] args) {
    String teaName, oldTeaName, newTeaName;
    Scanner sc = new Scanner(System.in);
    TeaShop tea = new TeaShop();
    for (int i = 0; i < tea.teaNames.length; i++) {
      System.out.println("Enter the tea names:");
      teaName = sc.next();
      tea.addTeaName(teaName);
    }
    System.out.println("Added tea names:");
    tea.getTeaName();
    System.out.println("Enter the oldTeaName:");
    oldTeaName = sc.next();
    System.out.println("Enter the newTeaName to update the oldTeaName:");
    newTeaName = sc.next();
    boolean verify = tea.updateTeaName(oldTeaName, newTeaName);
    System.out.println("Tea name is updated: " + verify);
    tea.getTeaName();
    System.out.println("Enter the tea name to search:");
    teaName = sc.next();
    String isPresent = tea.getTeaName(teaName);
    System.out.println("Searched tea name is: " + isPresent);
  }
}