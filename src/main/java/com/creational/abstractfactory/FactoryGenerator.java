package com.creational.abstractfactory;

public class FactoryGenerator {
  public static AbstractDeviceFactory getFactory(FactoryType factoryType) {
    switch (factoryType) {
      case LAPTOPFACTORY:
        return new LaptopFactory();
      case MOBILEFACTORY:
        return new MobileFactory();
      default:
        break;
    }
    return null;
    
  }
}
