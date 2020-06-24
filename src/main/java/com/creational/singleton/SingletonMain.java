package com.creational.singleton;

import java.lang.reflect.Constructor;

public class SingletonMain {
  public static void main(String[] args) throws CloneNotSupportedException {
    Singleton s1 = Singleton.getInstance();
    System.out.println(s1);
    
    Singleton s2 = Singleton.getInstance();
    System.out.println(s2);
    System.out.println(s1.equals(s2));
    
    //Break Singleton using reflection:
    Singleton s1Temp = Singleton.getInstance();
    Singleton s2Temp = null;
    Constructor<?>[] constructors = Singleton.class.getConstructors();
    for (Constructor<?> constructor : constructors) {
      constructor.setAccessible(true);
      try {        
        s2Temp = (Singleton) constructor.newInstance();
        System.out.println(s2Temp);
      } catch (Exception e) {
        e.printStackTrace();
      }
    }
    System.out.println(s1Temp);
    System.out.println(s2Temp);
    System.out.println(s1Temp.equals(s2Temp));
  }

}
