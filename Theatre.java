package com.xworkz.chatapp;

public class Theatre {
  String[] movieNames = new String[5];
  int index;
  
  public boolean addMovieName(String movieName) {
    boolean isAdded = false;
    if (movieName != null && index < movieNames.length) {
      movieNames[index++] = movieName;
      isAdded = true;
    } else {
      System.out.println("---------Array is full---------");
    }
    return isAdded;
  }
  
  public void getMovieNames() {
    for (String movieName : movieNames) {
      System.out.println(movieName);
    }
  }
  
  public boolean updateMovieName(String oldMovieName, String newMovieName) {
    boolean isUpdated = false;
    for (int i = 0; i < movieNames.length; i++) {
      if (movieNames[i].equals(oldMovieName)) {
        movieNames[i] = newMovieName;
        isUpdated = true;
        System.out.println("Updated movie name " + oldMovieName + " to " + newMovieName);
      }
    }
    return isUpdated;
  }
  
  public String getMovieName(String movieName) {
    for (String name : movieNames) {
      if (name.equals(movieName)) {
        return name;
      }
    }
    return "Not found";
  }
}