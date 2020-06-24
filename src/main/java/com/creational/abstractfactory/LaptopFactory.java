package com.creational.abstractfactory;

public class LaptopFactory extends AbstractDeviceFactory {
  @Override
  public Device getGadget(DeviceType deviceType) {
    switch (deviceType) {
      case HP:
        return new HP("intel", "8gb");
      case DELL:
        return new Dell("intel", "8gb");
      default:
        break;
    }
    return null;
  }
}