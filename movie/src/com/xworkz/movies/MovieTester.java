package com.xworkz.movies;

import com.xworkz.movies.movie.Movie;
import com.xworkz.movies.ticket.Ticket;

public class MovieTester {
  public static void main(String[] args) {
    Ticket ticket = new Ticket();
    Movie movie = new Movie(ticket);
    
    movie.ticket.watchMovie();
  }
}