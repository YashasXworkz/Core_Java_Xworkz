package com.xworkz.hotels;

import com.xworkz.hotels.hotel.Hotel;

public class Tester {
  public static void main(String[] args) {
    Hotel hotel = new Hotel();
    hotel.setId(1);
    hotel.setName("anand bhavan");
    hotel.setLocation("bashyam circle");
    System.out.println(hotel);
    
    Hotel hotel1 = new Hotel();
    hotel1.setId(2);
    hotel1.setName("sri venkatesh bhavan");
    hotel1.setLocation("bashyam circle");
    System.out.println(hotel1);
    
    Hotel hotel2 = new Hotel();
    hotel2.setId(3);
    hotel2.setName("swathi");
    hotel2.setLocation("dasarahalli");
    System.out.println(hotel2);
    
    Hotel hotel3 = new Hotel();
    hotel3.setId(4);
    hotel3.setName("nandhana");
    hotel3.setLocation("dhobi ghat");
    System.out.println(hotel3);
  }
}
