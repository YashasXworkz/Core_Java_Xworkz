package com.xworkz.bankapp;
import com.xworkz.bankapp.savings.SavingsAccount;
import java.util.Scanner;

public class SavingsAccountTester {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    
    // My Initial Balance
    SavingsAccount myAccount = new SavingsAccount();
    System.out.print("Enter the amount to credit to your account: ");
    double creditAmount = sc.nextDouble();
    myAccount.credit(creditAmount);
    System.out.println("My Account balance after credit: " + myAccount.getBalance());
    
    // Friend Initial Balance
    SavingsAccount friendAccount = new SavingsAccount();
    System.out.print("Enter the amount to credit to your friend's account: ");
    double friendCreditAmount = sc.nextDouble();
    friendAccount.credit(friendCreditAmount);
    System.out.println("Friend Account balance after credit: " + friendAccount.getBalance());
    
    // Transferring Amount
    System.out.print("Enter the amount to transfer from your account to your friend's account: ");
    double transferAmount = sc.nextDouble();
    myAccount.transfer(friendAccount, transferAmount);
    System.out.println("My Account balance after transfer: " + myAccount.getBalance());
    System.out.println("Friend Account balance after transfer: " + friendAccount.getBalance());
  }
}
