package com.xworkz.stringmethods;

public class StringMethods {
  public static void main(String[] args) {
    String str = "Java is SECURE language";
    System.out.println(str.length());
    System.out.println(str.charAt(5));
    System.out.println(str.substring(8));
    System.out.println(str.substring(5, 14));
    System.out.println(str.toLowerCase());
    System.out.println(str.toUpperCase());
    System.out.println(str.startsWith("Java"));
    System.out.println(str.endsWith("language"));
    System.out.println(str.contains("is"));
    System.out.println(str.indexOf("SECURE"));
    System.out.println(str.lastIndexOf("v"));
    System.out.println(str.isEmpty());
    
    String str1 = "X-";
    String str2 = "workz";
    System.out.println(str1.concat(str2));
    
    String str3 = "   Java   ";
    System.out.println(str3.trim());
    
    String str4 = "x-workz";
    System.out.println(str4.replace('x', 'X'));
    
    String str5 = "Java language";
    String[] parts = str5.split(" ");
    for (String part : parts)
      System.out.println(part);
    
    String replacedString = str5.replaceAll("a", "aaa");
    System.out.println(replacedString);
    
    int i = 454545;
    String str7 = String.valueOf(i);
    System.out.println(str7);
    String str8 = Integer.toString(i);
    System.out.println(str8);
    
    String str9 = "Java";
    char[] charArray = str9.toCharArray();
    for (char ch : charArray)
      System.out.println(ch);
    
    String str10= "Java, Java, Java";
    String replacedFirst = str10.replaceFirst("Java", "MySQL");
    System.out.println(replacedFirst);
  }
}
