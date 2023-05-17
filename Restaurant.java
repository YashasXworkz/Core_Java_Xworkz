package com.xworkz.chatapp;

public class Restaurant {
  String[] menuItems = new String[5];
  int index;
  
  public boolean addMenuItem(String menuItem) {
    boolean isAdded = false;
    if (menuItem != null && index < menuItems.length) {
      menuItems[index++] = menuItem;
      isAdded = true;
    }
    return isAdded;
  }
  
  public void getMenu() {
    for (String menuItem : menuItems) {
      System.out.println(menuItem);
    }
  }
  
  public boolean updateMenuItem(String oldMenuItem, String newMenuItem) {
    boolean isUpdated = false;
    for (int i = 0; i < menuItems.length; i++) {
      if (menuItems[i].equals(oldMenuItem)) {
        menuItems[i] = newMenuItem;
        isUpdated = true;
        System.out.println("Updated menu item " + oldMenuItem + " to " + newMenuItem);
      }
    }
    return isUpdated;
    
  }
  
  public String getMenu(String menuItem) {
    for (String item : menuItems) {
      if (item.equals(menuItem)) {
        return item;
      }
    }
    return "Not found";
  }
}