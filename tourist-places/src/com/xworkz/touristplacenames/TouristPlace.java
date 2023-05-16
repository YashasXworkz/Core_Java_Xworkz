package com.xworkz.touristplacenames;

public class TouristPlace {
  static String[] places = {"Taj Mahal", "Golden Temple", "Charminar", "Lotus Temple", "Red Fort",
          "Gateway of India", "Hawa Mahal", "Qutub Minar", "Amer Fort", "India Gate",
          "Jama Masjid", "Mysore Palace", "Victoria Memorial", "Ellora Caves",
          "Sanchi Stupa", "Fatehpur Sikri", "Hampi", "Ajanta Caves", "Khajuraho",
          "Konark Sun Temple"};
  
  public static void main(String[] methEx) {
    System.out.println("-----------------Main Started-----------------");
    getPlaces();
    System.out.println("-----------------Main Ended-----------------");
  }
  
  public static void getPlaces() {
    System.out.println("---------------------------------------");
    System.out.println("List of Tourist Places:" + places.length);
    for (int pl = 0; pl < places.length; pl++) {
      System.out.println(places[pl]);
    }
    return;
  }
}
