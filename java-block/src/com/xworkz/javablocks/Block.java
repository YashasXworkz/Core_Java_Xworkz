package com.xworkz.javablocks;

public class Block {
  static {
    System.out.println("static block invoked");
  }
  
  {
    System.out.println("init block invoked");
  }
  
  public Block() {
    System.out.println("constructor invoked");
  }
  
  public static void main(String[] args) {
    System.out.println("main method started");
    Block block = new Block();
    System.out.println("instance");
  }
}
