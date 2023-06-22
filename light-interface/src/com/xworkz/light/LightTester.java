package com.xworkz.light;

import com.xworkz.light.cflbulb.CFLBulb;
import com.xworkz.light.discolight.DiscoLight;
import com.xworkz.light.light.Light;
import com.xworkz.light.lightimpl.LightImpl;
import com.xworkz.light.switchlight.SwitchLight;

public class LightTester {
  public static void main(String[] args) {
    SwitchLight switchLight = new Light();
    switchLight.on();
    switchLight.off();
    System.out.println();
    
    SwitchLight switchLight1 = new DiscoLight();
    switchLight1.on();
    switchLight1.off();
    System.out.println();
    
    SwitchLight switchLight2 = new CFLBulb();
    switchLight2.on();
    switchLight2.off();
  }
}
