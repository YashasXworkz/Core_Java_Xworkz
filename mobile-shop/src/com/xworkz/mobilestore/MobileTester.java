package com.xworkz.mobilestore;

import com.xworkz.mobilestore.mobiles.Mobiles;
import com.xworkz.mobilestore.mobileshop.MobileShop;

public class MobileTester {
  public static void main(String[] args) {
    Mobiles mobiles = new Mobiles();
    MobileShop mobileShop = new MobileShop(mobiles);
    
    mobileShop.mobiles.showAvailableModels();
  }
}