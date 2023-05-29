package com.xworkz.newcompany;

import com.xworkz.newcompany.brand.Brand;
import com.xworkz.newcompany.company.Company;

public class CompanyTester {
  public static void main(String[] args) {
  Brand brand = new Brand();
  Company company = new Company(brand);
  
  company.brand.displayLogo();
  }
}