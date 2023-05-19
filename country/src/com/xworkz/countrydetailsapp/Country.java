package com.xworkz.countrydetailsapp;

public class Country {
  
  private int countryId;  //1
  private int countryCode;  //91
  private String countryName;  //India
  private int noOfStates;  //28
  private long population;  //1400000000
  private String currency;  //INR
  private String capital;  //NewDelhi
  private String economy;  //Developing
  
  public Country() {
  }
  
  public Country(int countryId, int countryCode, String countryName, int noOfStates, long population, String currency, String capital, String economy) {
    this.countryId = countryId;
    this.countryCode = countryCode;
    this.countryName = countryName;
    this.noOfStates = noOfStates;
    this.population = population;
    this.currency = currency;
    this.capital = capital;
    this.economy = economy;
  }
  
  public int getCountryId() {
    return countryId;
  }
  
  public void setCountryId(int countryId) {
    this.countryId = countryId;
  }
  
  public int getCountryCode() {
    return countryCode;
  }
  
  public void setCountryCode(int countryCode) {
    this.countryCode = countryCode;
  }
  
  public String getCountryName() {
    return countryName;
  }
  
  public void setCountryName(String countryName) {
    this.countryName = countryName;
  }
  
  public int getNoOfStates() {
    return noOfStates;
  }
  
  public void setNoOfStates(int noOfStates) {
    this.noOfStates = noOfStates;
  }
  
  public long getPopulation() {
    return population;
  }
  
  public void setPopulation(long population) {
    this.population = population;
  }
  
  public String getCurrency() {
    return currency;
  }
  
  public void setCurrency(String currency) {
    this.currency = currency;
  }
  
  public String getCapital() {
    return capital;
  }
  
  public void setCapital(String capital) {
    this.capital = capital;
  }
  
  public String getEconomy() {
    return economy;
  }
  
  public void setEconomy(String economy) {
    this.economy = economy;
  }
}
