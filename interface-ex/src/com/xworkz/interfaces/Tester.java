package com.xworkz.interfaces;

import com.xworkz.interfaces.medicalshop.MedicalShop;
import com.xworkz.interfaces.shop.Shop;

public class Tester {
  public static void main(String[] args) {
    Shop shop = new MedicalShop();
    shop.doBusiness();
  }
}