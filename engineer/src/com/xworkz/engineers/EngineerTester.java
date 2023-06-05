package com.xworkz.engineers;

import com.xworkz.engineers.engineer.Engineer;
import com.xworkz.engineers.engineertype.Civil;
import com.xworkz.engineers.engineertype.Electrical;

public class EngineerTester {
  public static void main(String[] args) {
    // Polymorphism
    // up casting
    Engineer engineer = new Electrical();
    engineer.solveProblem();
    
    Engineer engineer1 = new Civil();
    engineer1.solveProblem();
    
    // down casting
    Electrical electrical = (Electrical) engineer;
    electrical.buildSoftware();
    
    Civil civil = (Civil) engineer1;
    civil.buildDesign();
  }
}
