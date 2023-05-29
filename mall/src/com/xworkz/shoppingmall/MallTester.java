package com.xworkz.shoppingmall;

import com.xworkz.shoppingmall.mall.Mall;
import com.xworkz.shoppingmall.shop.Shop;

public class MallTester {
  public static void main(String[] args) {
    Shop shop = new Shop();
    Mall mall = new Mall(shop);
    
    mall.shop.doBusiness();
  }
}