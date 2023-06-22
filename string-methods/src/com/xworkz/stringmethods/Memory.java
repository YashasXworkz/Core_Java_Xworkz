package com.xworkz.stringmethods;

public class Memory {
  public static void main(String[] args) {
    //String hero = "yash"; //string literals. create string object
    //String hero6 = "yash";
    //String hero1 = null;
    //String heroine = "priya";
    //String heroine1 = new String("priya");
    //System.out.println(hero == hero1); //ref comparison //false
    //System.out.println(hero == hero6); //true
    //System.out.println(hero.equals(hero1)); //false
    //System.out.println(heroine == heroine1); //false
    //System.out.println(heroine.equals(heroine1)); //value comparison //true
    //String hero4 = "darshan";
    //String hero5 = "DARSHAN";
    //System.out.println(hero4 == hero5); //false
    //System.out.println(hero4.equals(hero5)); //false
    //System.out.println(hero5.equals(hero4)); //false
    //System.out.println(hero4.equalsIgnoreCase(hero5)); //true
    //System.out.println(hero5.equalsIgnoreCase(hero4)); //true
    //String hero3 = hero;
    //System.out.println(hero3 == hero); //true
    //System.out.println(hero3.equals(hero)); //true
    //System.out.println(hero.equals(hero3)); //true
    //String hero2 = "yash";
    //System.out.println(hero1 == hero2); //false
    //System.out.println(hero2.equals(hero1)); //false
    //System.out.println(hero1.equals(hero2)); //error
    //String class are immutable - cannot modify the content of an object (String object)
    String d1 = "Yashas";
    d1 = d1 + " S";
    System.out.println(d1);
    //mutable - can be able to change the content
    StringBuilder builder = new StringBuilder("Yashas");
    builder.append(" S");
    System.out.println(builder);
  }
}
