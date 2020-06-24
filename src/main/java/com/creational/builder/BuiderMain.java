package com.creational.builder;

public class BuiderMain {
  public static void main(String[] args) {
    Person person = new Person().name("srinu").number(506).colleage("avanthi");
    System.out.println(person.build());
  }
}
