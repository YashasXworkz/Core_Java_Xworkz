package com.xworkz.trainstation;

import com.xworkz.trainstation.compartment.Compartment;
import com.xworkz.trainstation.train.Train;

public class TrainTester {
  public static void main(String[] args) {
    Compartment compartment = new Compartment();
    Train train = new Train(compartment);
    
    train.compartment.loadPassengers();
  }
}