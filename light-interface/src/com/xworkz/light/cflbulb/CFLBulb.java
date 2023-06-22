package com.xworkz.light.cflbulb;

import com.xworkz.light.switchlight.SwitchLight;

public class CFLBulb implements SwitchLight {
  
  @Override
  public void on() {
    System.out.println("CFL bulb turned ON");
  }
  
  @Override
  public void off() {
    System.out.println("CFL bulb turned OFF");
  }
}
