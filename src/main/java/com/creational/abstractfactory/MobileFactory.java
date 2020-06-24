package com.creational.abstractfactory;

public class MobileFactory extends AbstractDeviceFactory {
  @Override
  public Device getGadget(DeviceType deviceType) {
    switch (deviceType) {
      case NOKIA:
        return new Nokia("nokia", "8gb");
      case ONEPLUS:
        return new OnePlus("oneplus", "intel", "8gb");
      default:
        break;
    }
    return null;
  }
}