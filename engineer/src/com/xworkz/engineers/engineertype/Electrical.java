package com.xworkz.engineers.engineertype;

import com.xworkz.engineers.engineer.Engineer;

public class Electrical extends Engineer {
  
  @Override
  public void solveProblem() {
    System.out.println("Problem solved by Electrical Engineer");
  }
  
  public void buildSoftware() {
    System.out.println("Building Software!");
  }
}
