package com.xworkz.abhibusapp.vrl;

import com.xworkz.abhibusapp.contract.AbhiBusContract;

public class VrlImpl implements AbhiBusContract {
  
  @Override
  public int minBookings() {
    return 15;
  }
  
  @Override
  public boolean busCondition() {
    return false;
  }
}
