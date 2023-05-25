package com.xworkz.bankapp;
import com.xworkz.bankapp.bankaccount.BankAccount;

public class BankAccountTester {
  public static void main(String[] args) {
    BankAccount bankAccount = new BankAccount();
    System.out.println("Existing balance before credit balance is: " + bankAccount.getBalance());
    bankAccount.credit(5000.00);
    System.out.println("Balance after credited: " + bankAccount.getBalance());
    double debitAmount = 1000.00;
    bankAccount.debit(debitAmount);
    System.out.println("Debited amount: " + debitAmount);
    System.out.println("Balance after debited: " + bankAccount.getBalance());
  }
}