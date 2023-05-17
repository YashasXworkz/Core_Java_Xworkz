package com.xworkz.chatapp;

import java.util.Scanner;

public class LibraryBookTester {
  public static void main(String[] args) {
    String bookName, oldBookName, newBookName;
    Scanner sc = new Scanner(System.in);
    LibraryBook book = new LibraryBook();
    for (int i = 0; i < book.bookNames.length; i++) {
      System.out.println("Enter the book names:");
      bookName = sc.next();
      book.addBookName(bookName);
    }
    System.out.println("Added book names:");
    book.getBookName();
    System.out.println("Enter the oldBookName:");
    oldBookName = sc.next();
    System.out.println("Enter the newBookName to update the oldBookName:");
    newBookName = sc.next();
    boolean verify = book.updateBookName(oldBookName, newBookName);
    System.out.println("Book name is updated: " + verify);
    book.getBookName();
    System.out.println("Enter the book name to search:");
    bookName = sc.next();
    String isPresent = book.getBookName(bookName);
    System.out.println("Searched book name is: " + isPresent);
  }
}