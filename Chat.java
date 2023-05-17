package com.xworkz.chatapp;

public class Chat {
  String[] chatNames = new String[5];
  int index;
  
  public boolean addChatName(String chatName) {
    boolean isAdded = false;
    if (chatName != null && index < chatNames.length) {
      chatNames[index++] = chatName;
      isAdded = true;
    } else {
      System.out.println("---Array is full---");
    }
    return isAdded;
  }
  
  public void getAllChatNames() {
    for (String chatName : chatNames) {
      System.out.println(chatName);
    }
  }
  
  public boolean updateChatName(String oldChatName, String newChatName) {
    boolean isUpdated = false;
    for (int i = 0; i < chatNames.length; i++) {
      if (chatNames[i].equals(oldChatName)) {
        chatNames[i] = newChatName;
        isUpdated = true;
        System.out.println("Updated chat name " + oldChatName + " to " + newChatName);
      }
    }
    return isUpdated;
  }
  
  public String getChatName(String chatName) {
    for (String name : chatNames) {
      if (name.equals(chatName)) {
        return name;
      }
    }
    return "Not found";
  }
}