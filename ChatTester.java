package com.xworkz.chatapp;

import java.util.Scanner;

public class ChatTester {
  public static void main(String[] args) {
    String chatName, oldChatName, newChatName;
    Scanner sc = new Scanner(System.in);
    Chat chat = new Chat();
    for (int i = 0; i < chat.chatNames.length; i++) {
      System.out.println("Enter the chat names:");
      chatName = sc.next();
      chat.addChatName(chatName);
    }
    System.out.println("Added chat names:");
    chat.getAllChatNames();
    System.out.println("Enter the oldChatName:");
    oldChatName = sc.next();
    System.out.println("Enter the newChatName to update the oldChatName:");
    newChatName = sc.next();
    boolean verify = chat.updateChatName(oldChatName, newChatName);
    System.out.println("Chat name is updated: " + verify);
    chat.getAllChatNames();
    System.out.println("Enter the chat name to search:");
    chatName = sc.next();
    String isPresent = chat.getChatName(chatName);
    System.out.println("Searched chat name is: " + isPresent);
  }
}