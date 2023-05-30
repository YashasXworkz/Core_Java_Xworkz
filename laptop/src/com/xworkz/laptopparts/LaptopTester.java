package com.xworkz.laptopparts;

import com.xworkz.laptopparts.harddisk.HardDisk;
import com.xworkz.laptopparts.laptop.Laptop;

public class LaptopTester {
  public static void main(String[] args) {
    HardDisk hardDisk = new HardDisk();
    Laptop laptop = new Laptop(hardDisk);
    
    laptop.hardDisk.readData();
  }
}
