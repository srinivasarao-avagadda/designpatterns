package com.creational.factory;

public class DellLaptop extends Laptop {

  private String name;
  private String processor;
  private String ram;
  
  public DellLaptop(String name, String processor, String ram) {
    this.name = name;
    this.processor = processor;
    this.ram = ram;
  }
  
  @Override
  public String getConfiguration() {
    return "Dell Device: name ->" + name + " ,processor -> " + this.processor + " , ram -> " + this.ram;
  }

  @Override
  public String toString() {
    return "Dell [name=" + name + ", processor=" + processor + ", ram=" + ram + "]";
  }

}
