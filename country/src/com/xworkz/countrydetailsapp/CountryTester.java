package com.xworkz.countrydetailsapp;

import java.util.Scanner;

public class CountryTester {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    
    System.out.println("Enter country id:");
    int countryId = sc.nextInt();  //1
    
    System.out.println("Enter country code (phone):");
    int countryCode = sc.nextInt();  //91
    
    System.out.println("Enter country name:");
    String countryName = sc.next();  //India
    
    System.out.println("Enter number of states:");
    int noOfStates = sc.nextInt();  //28
    
    System.out.println("Enter total population:");
    long population = sc.nextInt();  //1400000000
    
    System.out.println("Enter country currency (INR / EURO...):");
    String currency = sc.next();  //INR
    
    System.out.println("Enter capital of the country:");
    String countryCapital = sc.next();  //NewDelhi
    
    System.out.println("Enter country economy:");
    String countryEconomy = sc.next();  //Developing
    
    Country country = new Country();
    country.setCountryId(countryId);
    country.setCountryCode(countryCode);
    country.setCountryName(countryName);
    country.setNoOfStates(noOfStates);
    country.setPopulation(population);
    country.setCurrency(currency);
    country.setCapital(countryCapital);
    country.setEconomy(countryEconomy);
    
    System.out.println("Country ID: " + country.getCountryId() + "\nCountry Code: " + country.getCountryCode() + "\nCountry Name: " + country.getCountryName()
            + "\nNumber of States: " + country.getNoOfStates() + "\nTotal Number of Population: " + country.getPopulation()
            + "\nCurrency: " + country.getCurrency() + "\nCapital: " + country.getCapital() + "\nEconomy: " + country.getEconomy());
  }
}
