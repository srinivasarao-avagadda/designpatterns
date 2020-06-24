package com.structural.adapter;

public class TaxiDriver implements Driver {
  
  String cartNum;
  String licenseNum;
  BankAccount bankDetails;

  public String getCartNum() {
    return cartNum;
  }

  public void setCartNum(String cartNum) {
    this.cartNum = cartNum;
  }

  public void setLicenseNum(String licenseNum) {
    this.licenseNum = licenseNum;
  }

  public void setBankDetails(BankAccount bankDetails) {
    this.bankDetails = bankDetails;
  }

  public String getCarNum() {
    
    return this.cartNum;
  }

  public String getLicenseNum() {
    return this.licenseNum;
  }

  public BankAccount getBankDetails() {
    return this.bankDetails;
  }

}
