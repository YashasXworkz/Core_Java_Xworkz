package com.xworkz.interfaces.medicalshop;

import com.xworkz.interfaces.shop.Shop;

public class MedicalShop implements Shop {
  
  @Override
  public void doBusiness() {
    System.out.println("Sell Medicine");
  }
}