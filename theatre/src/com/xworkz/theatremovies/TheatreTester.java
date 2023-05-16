package com.xworkz.theatremovies;

public class TheatreTester {
  public static void main(String[] movies) {
    System.out.println("Main method started");
    Theatre.addMovieName("KGF Chapter 2");
    Theatre.addMovieName("Yuvarathnaa");
    Theatre.addMovieName("Roberrt");
    Theatre.addMovieName("Pogaru");
    Theatre.addMovieName("Salaga");
    Theatre.addMovieName("Bhajarangi 2");
    Theatre.addMovieName("Kotigobba 3");
    Theatre.addMovieName("Ramarjuna");
    Theatre.addMovieName("Pushpa");
    Theatre.addMovieName("Shivaji Surathkal");
    Theatre.addMovieName("Om"); // Extra argument to check whether the array is full
    Theatre.getMovieNames();
    boolean verify = Theatre.updateMovieName("Pushpa", "Pushpa Part 2");
    System.out.println("Movie name is updated: " + verify);
    Theatre.getMovieNames();
    String isPresent = Theatre.getMovieName("Roberrt");
    System.out.println("Searched movie name is: " + isPresent);
    System.out.println("Main method ended");
  }
}