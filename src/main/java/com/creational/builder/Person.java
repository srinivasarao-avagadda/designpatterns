package com.creational.builder;

public class Person {
  int number;
  String name;
  String colleage;
  
  public Person number(int number){
    this.number = number;
    return this;
  }
  
  public Person name(String name){
    this.name = name;
    return this;
  }
  
  public Person colleage(String colleage){
    this.colleage= colleage;
    return this;
  }
  
  public Person build() {
    return this;
  }

  @Override
  public String toString() {
    return "Person [number=" + number + ", name=" + name + ", colleage=" + colleage + "]";
  }

}
