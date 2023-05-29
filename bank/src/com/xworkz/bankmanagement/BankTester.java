package com.xworkz.bankmanagement;

import com.xworkz.bankmanagement.bank.Bank;
import com.xworkz.bankmanagement.branch.Branch;

public class BankTester {
  public static void main(String[] args) {
    Branch branch = new Branch();
    Bank bank = new Bank(branch);
    
    bank.branch.processTransactions();
  }
}
