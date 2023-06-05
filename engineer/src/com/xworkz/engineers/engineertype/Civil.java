package com.xworkz.engineers.engineertype;

import com.xworkz.engineers.engineer.Engineer;

public class Civil extends Engineer {
  
  @Override
  public void solveProblem() {
    System.out.println("Problem solved by Civil Engineer");
  }
  
  public void buildDesign() {
    System.out.println("Building Design!");
  }
}
