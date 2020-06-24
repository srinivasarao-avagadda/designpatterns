package com.structural.adapter;

import java.util.Arrays;
import java.util.List;

public class DriverAdapter extends TaxiDriver implements Driver {
  
  Person person;
  public DriverAdapter(Person person) {
    this.person = person;
    adaptPerson(person);
  }

  private void adaptPerson(Person person) {
    this.setCartNum(person.carNum);
    this.setLicenseNum(person.getLicenceNum());
    List<String> asList = Arrays.asList(person.getBankDetails().split(" "));
    BankAccount bankDetails = new BankAccount();
    bankDetails.setAccNum(asList.get(0));
    bankDetails.setIFSCCode(asList.get(1));
    bankDetails.setCity(asList.get(2));
    bankDetails.setBranch(asList.get(3));
    this.setBankDetails(bankDetails);
  }

}
