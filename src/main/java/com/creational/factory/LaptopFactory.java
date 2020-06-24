package com.creational.factory;

public class LaptopFactory{
  public static Laptop getLaptop(LaptopType laptopType) {
    switch (laptopType) {
      case HP:
        return new HPLaptop("intel", "8GB");
      case DELL:
        return new DellLaptop("dell", "intel", "8GN");
      default:
        break;
    }
    return null;
  }
}
