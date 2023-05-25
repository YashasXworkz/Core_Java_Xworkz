package com.xworkz.phonepeapp;

import com.xworkz.phonepeapp.bankaccount.BankAccount;

public class WalletTester {
  public static void main(String[] args) {
    // Wallet Balance
    BankAccount wallet = new BankAccount();
    wallet.credit(100000);
    System.out.println("Initial wallet balance: " + wallet.getBalance());
    
    // Shopping
    BankAccount zara = new BankAccount();
    wallet.transfer(zara, 12000);
    System.out.println("Wallet balance after shopping in Zara: " + wallet.getBalance());
    
    BankAccount allenSolly = new BankAccount();
    wallet.transfer(allenSolly, 5600);
    System.out.println("Wallet balance after shopping in Allen Solly: " + wallet.getBalance());
    
    BankAccount parkAvenue = new BankAccount();
    wallet.transfer(parkAvenue, 8500);
    System.out.println("Wallet balance after shopping in Park Avenue: " + wallet.getBalance());
    
    BankAccount raymond = new BankAccount();
    wallet.transfer(raymond, 15000);
    System.out.println("Wallet balance after shopping in Raymond: " + wallet.getBalance());
    
    BankAccount blackBerry = new BankAccount();
    wallet.transfer(blackBerry, 25000);
    System.out.println("Wallet balance after shopping in Black Berry: " + wallet.getBalance());
    
    BankAccount levis = new BankAccount();
    wallet.transfer(levis, 11900);
    System.out.println("Wallet balance after shopping in Levi's: " + wallet.getBalance());
    
    BankAccount lee = new BankAccount();
    wallet.transfer(lee, 12000);
    System.out.println("Wallet balance after shopping in Lee: " + wallet.getBalance());
    
    System.out.println("Final wallet balance: " + wallet.getBalance());
  }
}
