package com.structural.adapter;

public class Register {
  public static void main(String[] args) {
    Person person = new Person();
    person.setCarNum("AP 0006");
    person.setLicenceNum("AP123456");
    person.setBankDetails("123 SBI vizag pendurthi");
    
    Driver driver = new DriverAdapter(person);
    System.out.println(driver.getCarNum());
    System.out.println(driver.getLicenseNum());
    System.out.println(driver.getBankDetails());
  }

}
