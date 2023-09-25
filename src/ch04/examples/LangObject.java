package ch04.examples;

import java.time.LocalDateTime;

public class LangObject {
  public static void main(String[] args) {
    Object o = new Object();

    // res: java.lang.Object@15db9742
    System.out.println(o);

    int hours = LocalDateTime.now().getHour();

    // res: 18
    System.out.println(hours);

    // true
    System.out.println(LocalDateTime.now() instanceof LocalDateTime);
  }
}