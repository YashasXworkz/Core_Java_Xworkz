package com.xworkz.bankapp;

import com.xworkz.bankapp.savings.SavingsAccount;

public class BankAccountTester {
  public static void main(String[] args) {
    SavingsAccount myAccount = new SavingsAccount(1.5, 1000.0);
    endOfMonth(myAccount, 1);
    System.out.println("My Account balance after 1 month: " + myAccount.getBalance());
    endOfMonth(myAccount, 5);
    System.out.println("My Account balance after 6 months: " + myAccount.getBalance());
  }
  
  public static void endOfMonth(SavingsAccount account, int numberOfMonths) {
    account.addPeriodicInterest(numberOfMonths);
  }
}