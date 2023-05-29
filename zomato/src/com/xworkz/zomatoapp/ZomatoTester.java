package com.xworkz.zomatoapp;

import com.xworkz.zomatoapp.delivery.Delivery;
import com.xworkz.zomatoapp.zomato.Zomato;

public class ZomatoTester {
  public static void main(String[] args) {
  Delivery delivery = new Delivery();
  Zomato zomato = new Zomato(delivery);
  
  zomato.delivery.deliverFood();
  }
}
