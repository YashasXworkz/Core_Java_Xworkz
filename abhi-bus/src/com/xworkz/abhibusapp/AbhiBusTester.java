package com.xworkz.abhibusapp;

import com.xworkz.abhibusapp.contract.AbhiBusContract;
import com.xworkz.abhibusapp.travelagency.TravelAgency;
import com.xworkz.abhibusapp.vrl.VrlImpl;

public class AbhiBusTester {
  public static void main(String[] args) {
    AbhiBusContract abhiBusContract = new VrlImpl();
    TravelAgency travelAgency = new TravelAgency(abhiBusContract);
    
    int noOfBookings = 10;
    boolean isBookingConfirmed = travelAgency.bookingTicket(noOfBookings);
    System.out.println("Booking confirmed? " + isBookingConfirmed);
  }
}