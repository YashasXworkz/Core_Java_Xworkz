package com.xworkz.phonepeapp.bankaccount;

public class BankAccount {
  double balance;
  
  public void credit(double amount) {
    balance += amount;
  }
  
  public void debit(double amount) {
    balance -= amount;
  }
  
  public double getBalance() {
    return balance;
  }
  
  public void transfer(BankAccount beneficiary, double amount) {
    this.debit(amount);
    beneficiary.credit(amount);
  }
}