package com.xworkz.factoryproducts;

import com.xworkz.factoryproducts.factory.Factory;
import com.xworkz.factoryproducts.machine.Machine;

public class FactoryTester {
  public static void main(String[] args) {
    Machine machine = new Machine();
    Factory factory = new Factory(machine);
    
    factory.machine.runMachines();
  }
}