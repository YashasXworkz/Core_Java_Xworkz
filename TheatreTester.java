package com.xworkz.chatapp;

import java.util.Scanner;

public class TheatreTester {
  public static void main(String[] args) {
    String movieName, oldMovieName, newMovieName;
    Scanner sc = new Scanner(System.in);
    Theatre movie = new Theatre();
    for (int i = 0; i < movie.movieNames.length; i++) {
      System.out.println("Enter the movie names:");
      movieName = sc.next();
      movie.addMovieName(movieName);
    }
    System.out.println("Added movie names:");
    movie.getMovieNames();
    System.out.println("Enter the oldMovieName:");
    oldMovieName = sc.next();
    System.out.println("Enter the newMovieName to update the oldMovieName:");
    newMovieName = sc.next();
    boolean verify = movie.updateMovieName(oldMovieName, newMovieName);
    System.out.println("Movie name is updated: " + verify);
    movie.getMovieNames();
    System.out.println("Enter the movie name to search:");
    movieName = sc.next();
    String isPresent = movie.getMovieName(movieName);
    System.out.println("Searched movie name is: " + isPresent);
  }
}