package com.creational.abstractfactory;

public class AbstractFactoryMain {
    public static void main(String[] args) {
        Device dell = FactoryGenerator.getFactory(FactoryType.LAPTOPFACTORY).getGadget(DeviceType.DELL);
        System.out.println(dell.getDetails());
        System.out.println(dell.toString());

        Device nokia = FactoryGenerator.getFactory(FactoryType.MOBILEFACTORY).getGadget(DeviceType.NOKIA);
        System.out.println(nokia.getDetails());
        System.out.println(nokia.toString());
    }

}
