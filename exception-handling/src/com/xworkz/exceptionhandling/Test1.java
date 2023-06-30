package com.xworkz.exceptionhandling;

public class Test1 extends Test{
  int age;
  
  public Test1(String name, int age) {
    super(name);
    this.age = age;
  }
  
  public void display() {
    super.display();
    System.out.println(age);
  }
  
  public static void main(String[] args) {
    Test1 test1 = new Test1("Virat", 23);
    test1.display();
  }
}
