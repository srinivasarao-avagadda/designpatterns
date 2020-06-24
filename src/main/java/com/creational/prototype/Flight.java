package com.creational.prototype;

import java.util.ArrayList;
import java.util.List;

public class Flight implements Cloneable {
  List<String> defaultFlightList = null;
  public Flight() {
    defaultFlightList = new ArrayList<String>();
    defaultFlightList.add("emirates");
    defaultFlightList.add("british airways");
    defaultFlightList.add("indigo");
  }
  
  public Flight(List<String> temp) {
    defaultFlightList = temp;
  }

  public List<String> loadDefaultFilghtList() {
    return defaultFlightList;
  }
  
  @Override
  public Flight clone() throws CloneNotSupportedException {
    List<String> temp = new ArrayList<String>();
    for (String string : this.defaultFlightList) {
      temp.add(string);
    }
    return new Flight(temp);
  }
}
