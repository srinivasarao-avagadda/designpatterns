package com.creational.abstractfactory;

public class OnePlus extends Device {

  private String name;
  private String processor;
  private String ram;
  
  public OnePlus(String name, String processor, String ram) {
    this.name = name;
    this.processor = processor;
    this.ram = ram;
  }
  
  @Override
  public String getDetails() {
    return "Oneplus device: name ->" + name + " ,processor -> " + this.processor + " , ram -> " + this.ram;
    
  }

  @Override
  public String toString() {
    return "Oneplus [name=" + name + ", processor=" + processor + ", ram=" + ram + "]";
  }
}
