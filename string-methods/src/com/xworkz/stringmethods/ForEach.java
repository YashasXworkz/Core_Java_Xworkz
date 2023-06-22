package com.xworkz.stringmethods;

public class ForEach {
  public static void main(String[] args) {
    String str = "Java language";
    String[] parts = str.split(" ");
    for (String part : parts)
      System.out.println(part);
    
    int[] ints = {10, 50, 60, 80, 90};
    for (int ele : ints)
      System.out.println(ele);
    
    long[] longs = {9898989898L, 8989898989L};
    for (long ele1 : longs)
      System.out.println(ele1);
    
    double[] doubles = {30.55, 56.67, 67.78};
    for (double ele2: doubles)
      System.out.println(ele2);
    
    char[] chars = {'j', 'a', 'v', 'a'};
    for (char ch : chars)
      System.out.println(ch);
  }
}
