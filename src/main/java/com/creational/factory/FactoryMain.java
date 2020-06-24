package com.creational.factory;

public class FactoryMain {
  public static void main(String[] args) {
    Laptop dell = LaptopFactory.getLaptop(LaptopType.DELL);
    Laptop hp = LaptopFactory.getLaptop(LaptopType.HP);
    System.out.println(dell.getConfiguration());
    System.out.println(dell.toString());
    System.out.println(hp.getConfiguration());
    System.out.println(hp.toString());
  }

}
