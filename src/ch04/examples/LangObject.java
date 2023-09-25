package ch04.examples;

import java.util.Date;

public class LangObject {
  public static void main(String[] args) {
    Object o = new Object();

    // res: java.lang.Object@15db9742
    System.out.println(o);

    int hours = new Date().getHours();

    // res: 18
    System.out.println(hours);

    // true
    System.out.println(new Date() instanceof Date);
  }
}