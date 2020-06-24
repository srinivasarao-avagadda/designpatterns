package com.creational.factory;

public class HPLaptop extends Laptop {
  
  private String processor;
  private String ram;
  
  public HPLaptop(String processor, String ram) {
    this.processor = processor;
    this.ram = ram;
  }
  
  @Override
  public String getConfiguration() {
    return "HP configuration: processor -> " + this.processor + " , ram -> " + this.ram;
    
  }

  @Override
  public String toString() {
    return "HP [processor=" + processor + ", ram=" + ram + "]";
  }

}
