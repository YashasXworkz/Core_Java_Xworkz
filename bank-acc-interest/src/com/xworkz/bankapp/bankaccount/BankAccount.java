package com.xworkz.bankapp.bankaccount;

public class BankAccount {
  private double balance;
  
  public void setBalance(double balance) {
    this.balance = balance;
  }
  
  public void credit(double amount) {
    balance += amount;
  }
  
  public void debit(double amount) {
    balance -= amount;
  }
  
  public double getBalance() {
    return balance;
  }
}