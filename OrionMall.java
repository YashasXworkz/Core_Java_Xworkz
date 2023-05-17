package com.xworkz.chatapp;

public class OrionMall {
  String[] shopNames = new String[5];
  int index;
  
  public boolean addShopName(String shopName) {
    boolean isAdded = false;
    if (shopName != null && index < shopNames.length) {
      shopNames[index++] = shopName;
      isAdded = true;
    } else {
      System.out.println("---Array is full---");
    }
    return isAdded;
  }
  
  public void getShopName() {
    for (String shopName : shopNames) {
      System.out.println(shopName);
    }
  }
  
  public boolean updateShopName(String oldShopName, String newShopName) {
    boolean isUpdated = false;
    for (int i = 0; i < shopNames.length; i++) {
      if (shopNames[i].equals(oldShopName)) {
        shopNames[i] = newShopName;
        isUpdated = true;
        System.out.println("Updated shop name " + oldShopName + " to " + newShopName);
      }
    }
    return isUpdated;
  }
  
  public String getShopName(String shopName) {
    for (int i = 0; i < shopNames.length; i++) {
      if (shopNames[i].equals(shopName)) {
        return shopNames[i];
      }
    }
    return "Not found";
  }
}