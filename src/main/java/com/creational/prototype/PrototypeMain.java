package com.creational.prototype;

import java.util.List;

public class PrototypeMain {
  public static void main(String[] args) throws CloneNotSupportedException {
    Flight flight = new Flight();
    flight.loadDefaultFilghtList();
    
    Flight morningFlight = flight.clone();
    List<String> morningFlightList = morningFlight.loadDefaultFilghtList();
    morningFlightList.add("flight1");
    
    Flight nightFlight = flight.clone();
    List<String> nightFlightList = nightFlight.loadDefaultFilghtList();
    nightFlightList.remove("indigo");
    
    System.out.println(morningFlight);
    System.out.println(nightFlight);  
  }

}
