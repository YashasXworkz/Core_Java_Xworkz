package com.xworkz.chatapp;

import java.util.Scanner;

public class OrionMallTester {
  public static void main(String[] args) {
    String shopName, oldShopName, newShopName;
    Scanner sc = new Scanner(System.in);
    OrionMall shop = new OrionMall();
    for (int i = 0; i < shop.shopNames.length; i++) {
      System.out.println("Enter the shop names:");
      shopName = sc.next();
      shop.addShopName(shopName);
    }
    System.out.println("Added shop names:");
    shop.getShopName();
    System.out.println("Enter the oldShopName:");
    oldShopName = sc.next();
    System.out.println("Enter the newShopName to update the oldShopName:");
    newShopName = sc.next();
    boolean verify = shop.updateShopName(oldShopName, newShopName);
    System.out.println("Shop name is updated: " + verify);
    shop.getShopName();
    System.out.println("Enter the shop name to search:");
    shopName = sc.next();
    String isPresent = shop.getShopName(shopName);
    System.out.println("Searched shop name is: " + isPresent);
  }
}