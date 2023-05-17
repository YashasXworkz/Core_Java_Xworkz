package com.xworkz.chatapp;

public class LibraryBook {
  String[] bookNames = new String[5];
  int index;
  
  public boolean addBookName(String bookName) {
    boolean isAdded = false;
    if (bookName != null && index < bookNames.length) {
      bookNames[index++] = bookName;
      isAdded = true;
    } else {
      System.out.println("---Array is full---");
    }
    return isAdded;
  }
  
  public void getBookName() {
    for (String bookName : bookNames) {
      System.out.println(bookName);
    }
  }
  
  public boolean updateBookName(String oldBookName, String newBookName) {
    boolean isUpdated = false;
    for (int i = 0; i < bookNames.length; i++) {
      if (bookNames[i].equals(oldBookName)) {
        bookNames[i] = newBookName;
        isUpdated = true;
        System.out.println("Updated book name " + oldBookName + " to " + newBookName);
      }
    }
    return isUpdated;
  }
  
  public String getBookName(String bookName) {
    for (String name : bookNames) {
      if (name.equals(bookName)) {
        return name;
      }
    }
    return "Not found";
  }
}