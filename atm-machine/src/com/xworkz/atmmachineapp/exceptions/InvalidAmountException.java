package com.xworkz.atmmachineapp.exceptions;

public class InvalidAmountException extends RuntimeException {
  public InvalidAmountException() {
    System.out.println("Invalid withdrawal amount.");
  }
}
