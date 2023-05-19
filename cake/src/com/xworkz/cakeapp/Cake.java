package com.xworkz.cakeapp;

public class Cake {
  
  private int cakeId;  //1
  private String color;  //White
  private String shape;  //Round
  private String flavor;  //Vanilla
  private double price;  //699.99
  
  public Cake() {
  }
  
  public Cake(int cakeId, String color, String shape, String flavor, double price) {
    this.cakeId = cakeId;
    this.color = color;
    this.shape = shape;
    this.flavor = flavor;
    this.price = price;
  }
  
  public int getCakeId() {
    return cakeId;
  }
  
  public void setCakeId(int cakeId) {
    this.cakeId = cakeId;
  }
  
  public String getColor() {
    return color;
  }
  
  public void setColor(String color) {
    this.color = color;
  }
  
  public String getShape() {
    return shape;
  }
  
  public void setShape(String shape) {
    this.shape = shape;
  }
  
  public String getFlavor() {
    return flavor;
  }
  
  public void setFlavor(String flavor) {
    this.flavor = flavor;
  }
  
  public double getPrice() {
    return price;
  }
  
  public void setPrice(double price) {
    this.price = price;
  }
}
