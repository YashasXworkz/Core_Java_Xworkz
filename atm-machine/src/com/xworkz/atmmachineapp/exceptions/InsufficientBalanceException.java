package com.xworkz.atmmachineapp.exceptions;

public class InsufficientBalanceException extends Exception {
  public InsufficientBalanceException() {
    System.out.println("Insufficient balance.");
  }
}
