package com.xworkz.countryapp;

import com.xworkz.countryapp.country.Country;
import com.xworkz.countryapp.state.State;

public class CountryTester {
  public static void main(String[] args) {
    State state = new State();
    Country country = new Country(state);
    
    country.state.enforceLaws();
  }
}