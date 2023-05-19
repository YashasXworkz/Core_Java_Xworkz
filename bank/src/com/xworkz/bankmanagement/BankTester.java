package com.xworkz.bankmanagement;

import java.util.Scanner;

public class BankTester {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    
    System.out.println("Enter bank id:");
    int bankId = sc.nextInt();  //1
    
    System.out.println("Enter account number:");
    long accountNumber = sc.nextLong();  //9876543210987654
    
    System.out.println("Enter bank name:");
    String bankName = sc.next();  //SBI
    
    System.out.println("Enter account type (Savings / Current / Salary):");
    String accountType = sc.next();  //Salary
    
    System.out.println("Enter bank IFSC code:");
    String bankIfscCode = sc.next();  //SBI4567890
    
    System.out.println("Enter bank location:");
    String bankLocation = sc.next();  //Bengaluru
    
    Bank bank = new Bank();
    bank.setBankId(bankId);
    bank.setAccountNo(accountNumber);
    bank.setBankName(bankName);
    bank.setAccountType(accountType);
    bank.setIfscCode(bankIfscCode);
    bank.setLocation(bankLocation);
    
    System.out.println("Bank ID: " + bank.getBankId() + "\nAccount Number: " + bank.getAccountNo() + "\nBank Name: " + bank.getBankName()
            + "\nAccount Type (Savings / Current / Salary): " + bank.getAccountType() + "\nBank IFSC Code: " + bank.getIfscCode()
            + "\nBank Location: " + bank.getLocation());
  }
}
