package com.xworkz.bankapp.savings;

import com.xworkz.bankapp.bankaccount.BankAccount;

public class SavingsAccount extends BankAccount {
  // Which includes all BankAccount class instance methods
  double interestRate;
  
  public SavingsAccount(double interestRate, double minBalance) {
    this.interestRate = interestRate;
    setBalance(minBalance);
  }
  
  public void addPeriodicInterest(int numberOfMonths) {
    double interest = (getBalance() * interestRate) / 100;
    double totalInterest = interest * numberOfMonths;
    this.credit(totalInterest);
  }
}