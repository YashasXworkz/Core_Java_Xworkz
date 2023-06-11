package com.xworkz.casting;

public class Type {
  // we convert a smaller data type into a larger data type.
  int i = 10;
  long l = i;  // Implicit casting from int to long
  
  float f = 3.14f;
  double d = f;  // Implicit casting from float to double
  
  // we convert a larger data type into a smaller data type.
  double d2 = 3.14;
  int i2 = (int) d2;  // Explicit casting from double to int
  
  long l2 = 10000000000L;
  int i3 = (int) l2;  // Explicit casting from long to int
  
  public static void main(String[] args) {
    Type type = new Type();
    System.out.println(type.l);
    System.out.println(type.d);
    System.out.println(type.i2);
    System.out.println(type.i3);
  }
}
