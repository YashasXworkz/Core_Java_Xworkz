package com.xworkz.chatapp;

import java.util.Scanner;

public class RestaurantTester {
  public static void main(String[] args) {
    String menuItem, oldMenuItem, newMenuItem;
    Scanner sc = new Scanner(System.in);
    Restaurant menu = new Restaurant();
    for (int i = 0; i < menu.menuItems.length; i++) {
      System.out.println("Enter the menu items:");
      menuItem = sc.next();
      menu.addMenuItem(menuItem);
    }
    System.out.println("Added menu items:");
    menu.getMenu();
    System.out.println("Enter the oldMenuItem:");
    oldMenuItem = sc.next();
    System.out.println("Enter the newMenuItem to update the oldMenuItem:");
    newMenuItem = sc.next();
    boolean verify = menu.updateMenuItem(oldMenuItem, newMenuItem);
    System.out.println("Menu item is updated: " + verify);
    menu.getMenu();
    System.out.println("Enter the menu item to search:");
    menuItem = sc.next();
    String isPresent = menu.getMenu(menuItem);
    System.out.println("Searched menu item is: " + isPresent);
  }
}