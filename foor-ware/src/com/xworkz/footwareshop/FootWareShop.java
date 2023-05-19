package com.xworkz.footwareshop;

public class FootWareShop {
  private int footID;  //1
  private String brandName;  //Woodland
  private int size;  //8
  private String type;  //Boots
  private double price;  //3999.50
  private String materialType;  //Leather
  
  public int getFootID() {
    return footID;
  }
  
  public void setFootID(int footID) {
    this.footID = footID;
  }
  
  public String getBrandName() {
    return brandName;
  }
  
  public void setBrandName(String brandName) {
    this.brandName = brandName;
  }
  
  public int getSize() {
    return size;
  }
  
  public void setSize(int size) {
    this.size = size;
  }
  
  public String getType() {
    return type;
  }
  
  public void setType(String type) {
    this.type = type;
  }
  
  public double getPrice() {
    return price;
  }
  
  public void setPrice(double price) {
    this.price = price;
  }
  
  public String getMaterialType() {
    return materialType;
  }
  
  public void setMaterialType(String materialType) {
    this.materialType = materialType;
  }
}
