package com.xworkz.atmmachineapp.exceptions;

public class WrongPinException extends Exception {
  public WrongPinException() {
    System.out.println("Invalid Pin.");
  }
}
