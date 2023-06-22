package com.xworkz.light.discolight;

import com.xworkz.light.switchlight.SwitchLight;

public class DiscoLight implements SwitchLight {
  
  @Override
  public void on() {
    System.out.println("Disco-light turned ON");
  }
  
  @Override
  public void off() {
    System.out.println("Disco-light turned OFF");
  }
}
