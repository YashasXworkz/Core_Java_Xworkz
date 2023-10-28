package com.xworkz.atmmachineapp.atm;

import com.xworkz.atmmachineapp.customer.*;
import com.xworkz.atmmachineapp.exceptions.*;

public interface Atm {
  boolean addCustomer(Customer customer);
  void getAllCustomers();
  void verifyAtmPin(int userPin) throws WrongPinException;
  void withdraw(int id, int amount, int userPin) throws InsufficientBalanceException, WrongPinException;
}
