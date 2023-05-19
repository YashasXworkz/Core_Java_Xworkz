package com.xworkz.footwareshop;

import java.util.Scanner;

public class FootWareShopTester {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    
    System.out.println("Enter foot id:");
    int footId = sc.nextInt();  //1
    
    System.out.println("Enter brand name:");
    String brandName = sc.next();  //Woodland
    
    System.out.println("Enter foot size:");
    int footSize = sc.nextInt();  //8
    
    System.out.println("Enter foot type:");
    String footType = sc.next();  //Boots
    
    System.out.println("Enter price:");
    double price = sc.nextDouble();  //3999.50
    
    System.out.println("Enter foot material:");
    String materialType = sc.next();  //Leather
    
    FootWareShop foot = new FootWareShop();
    foot.setFootID(footId);
    foot.setBrandName(brandName);
    foot.setSize(footSize);
    foot.setType(footType);
    foot.setPrice(price);
    foot.setMaterialType(materialType);
    
    System.out.println("Foot ID: " + foot.getFootID() + "\nBrand Name: " + foot.getBrandName() + "\nSize: " + foot.getSize()
            + "\nType: " + foot.getType() + "\nPrice in Rs: " + foot.getPrice() + "\nMaterial: " + foot.getMaterialType());
    
  }
}
