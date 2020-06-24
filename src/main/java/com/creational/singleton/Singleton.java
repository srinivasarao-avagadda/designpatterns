package com.creational.singleton;

public class Singleton {
  private Singleton()  {}
  
  private static Singleton lazyIntialization = null;
  
  public static Singleton getInstance() {
    if (lazyIntialization == null) {
      synchronized (Singleton.class) {
        if (lazyIntialization == null) {
         lazyIntialization = new Singleton(); 
        }
      }
    }
    return lazyIntialization;
  }
}