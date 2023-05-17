package com.xworkz.chatapp;

public class TeaShop {
  String[] teaNames = new String[5];
  int index;
  
  public boolean addTeaName(String teaName) {
    boolean isAdded = false;
    if (teaName != null && index < teaNames.length) {
      teaNames[index++] = teaName;
      isAdded = true;
    } else {
      System.out.println("-------Array is full-------");
    }
    return isAdded;
  }
  
  public void getTeaName() {
    for (String teaName : teaNames) {
      System.out.println(teaName);
    }
  }
  
  public boolean updateTeaName(String oldTeaName, String newTeaName) {
    boolean isUpdated = false;
    for (int i = 0; i < teaNames.length; i++) {
      if (teaNames[i].equals(oldTeaName)) {
        teaNames[i] = newTeaName;
        isUpdated = true;
        System.out.println("Updated tea name " + oldTeaName + " to " + newTeaName);
      }
    }
    return isUpdated;
  }
  
  public String getTeaName(String teaName) {
    for (String name : teaNames) {
      if (name.equals(teaName)) {
        return name;
      }
    }
    return "Not found";
  }
}