package com.xworkz.countryapp.country;

import com.xworkz.countryapp.state.State;

public class Country {
  public State state;
  
  public Country(State state) {
    this.state = state;
  }
}