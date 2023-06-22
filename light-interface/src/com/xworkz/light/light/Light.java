package com.xworkz.light.light;

import com.xworkz.light.lightimpl.LightImpl;

public class Light extends LightImpl {
  
  @Override
  public void on() {
    System.out.println("Tube-light turned ON");
  }
  
  @Override
  public void off() {
  
  }
}
