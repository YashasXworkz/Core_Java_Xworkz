package com.xworkz.abhibusapp.travelagency;

import com.xworkz.abhibusapp.contract.AbhiBusContract;

public class TravelAgency {
  AbhiBusContract abhiBusContract;
  
  public TravelAgency(AbhiBusContract abhiBusContract) {
    this.abhiBusContract = abhiBusContract;
  }
  
  String name = "Sri Durga Travels";
  
  public boolean bookingTicket(int noOfBookings) {
    boolean isBookingConfirmed = false;
    System.out.println("Initiating Booking...");
    boolean isBusConditionOkay = abhiBusContract.busCondition();
    if (isBusConditionOkay) {
      System.out.println("Condition is good... proceed for Booking");
      if (noOfBookings <= this.abhiBusContract.minBookings()) {
        isBookingConfirmed = true;
        System.out.println("Thank you for booking tickets with " + name);
      } else {
        System.out.println("Booking not confirmed. Number of bookings exceeds the limit.");
      }
    } else {
      System.out.println("Booking not confirmed. Bus condition is not okay.");
    }
    return isBookingConfirmed;
  }
}