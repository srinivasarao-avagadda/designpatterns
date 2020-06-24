package com.creational.abstractfactory;

public class Nokia extends Device {
  
  private String processor;
  private String ram;
  
  public Nokia(String processor, String ram) {
    this.processor = processor;
    this.ram = ram;
  }
  
  @Override
  public String getDetails() {
    return "Nokia Device: processor -> " + this.processor + " , ram -> " + this.ram;
    
  }

  @Override
  public String toString() {
    return "Nokia [processor=" + processor + ", ram=" + ram + "]";
  }

}
