package com.xworkz.telvision;

import com.xworkz.telvision.remote.Remote;
import com.xworkz.telvision.tv.TV;

public class TVTester {
  public static void main(String[] args) {
    Remote remote = new Remote();
    TV tv = new TV(remote);
    
    tv.remote.pressPowerButton();
  }
}
