package com.creational.abstractfactory;

public class HP extends Device {
  
  private String processor;
  private String ram;
  
  public HP(String processor, String ram) {
    this.processor = processor;
    this.ram = ram;
  }
  
  @Override
  public String getDetails() {
    return "HP Device: processor -> " + this.processor + " , ram -> " + this.ram;
    
  }

  @Override
  public String toString() {
    return "HP [processor=" + processor + ", ram=" + ram + "]";
  }

}
