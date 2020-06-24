package com.structural.adapter;

public class BankAccount {
  
  
  String accNum;
  String IFSCCode;
  String city;
  String branch;
  public String getAccNum() {
    return accNum;
  }
  public void setAccNum(String accNum) {
    this.accNum = accNum;
  }
  public String getIFSCCode() {
    return IFSCCode;
  }
  public void setIFSCCode(String iFSCCode) {
    IFSCCode = iFSCCode;
  }
  public String getCity() {
    return city;
  }
  public void setCity(String city) {
    this.city = city;
  }
  public String getBranch() {
    return branch;
  }
  public void setBranch(String branch) {
    this.branch = branch;
  }
  
  @Override
  public String toString() {
    return "BankAccount [accNum=" + accNum + ", IFSCCode=" + IFSCCode + ", city=" + city + ", branch=" + branch + "]";
  }
}
