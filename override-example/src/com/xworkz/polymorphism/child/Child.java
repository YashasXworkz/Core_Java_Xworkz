package com.xworkz.polymorphism.child;

import com.xworkz.polymorphism.parent.Parent;

public class Child extends Parent {
  
  public Child() {
    //super() - compiler will provide super() as the first statement of the constructor.
    super(1);
    System.out.println("Child Object is created");
  }
  
  @Override
  public double business() {
    System.out.println("Child business");
    return 101.0;
  }
}
