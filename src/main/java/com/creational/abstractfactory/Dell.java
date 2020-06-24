package com.creational.abstractfactory;

public class Dell extends Device {
  
  private String processor;
  private String ram;
  
  public Dell(String processor, String ram) {
    this.processor = processor;
    this.ram = ram;
  }
  
  @Override
  public String getDetails() {
    return "Dell Device: processor -> " + this.processor + " , ram -> " + this.ram;
    
  }

  @Override
  public String toString() {
    return "Dell [processor=" + processor + ", ram=" + ram + "]";
  }

}
