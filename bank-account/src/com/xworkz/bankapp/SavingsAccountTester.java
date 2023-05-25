package com.xworkz.bankapp;

import com.xworkz.bankapp.current.CurrentAccount;
import com.xworkz.bankapp.savings.SavingsAccount;

public class SavingsAccountTester {
  public static void main(String[] args) {
    // My Initial Balance
    SavingsAccount myAccount = new SavingsAccount();
    myAccount.credit(10000);
    System.out.println("My Account balance after credit: " + myAccount.getBalance());
    
    // Friend Initial Balance
    SavingsAccount friendAccount = new SavingsAccount();
    friendAccount.credit(1000);
    System.out.println("Friend Account balance after credit: " + friendAccount.getBalance());
    
    // Transferring Amount
    myAccount.transfer(friendAccount, 3000);
    System.out.println("My Account balance after transfer: " + myAccount.getBalance());
    System.out.println("Friend Account balance after transfer: " + friendAccount.getBalance());
    
    // Transferring Amount to Tea shop
    double teaPrice = 50;
    CurrentAccount teaBusiness = new CurrentAccount();
    friendAccount.transfer(teaBusiness, teaPrice);
    System.out.println("Transferred amount: " + teaPrice);
    System.out.println("Friend Account balance after transferring to tea shop: " + friendAccount.getBalance());
  }
}
