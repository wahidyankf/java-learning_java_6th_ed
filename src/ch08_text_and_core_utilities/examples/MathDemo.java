package ch08_text_and_core_utilities.examples;

import static java.lang.Math.round;

public class MathDemo {
  public static void main(String[] args) {
    int zero = 0;
    try {
      int i = 72 / zero;

      System.out.println(i);
    } catch (ArithmeticException e) {

      // res: ArithmeticException: / by zero
      System.out.println("ArithmeticException: " + e.getMessage());
    }

    System.out.println("---");

    // res: Infinity
    System.out.println(Double.POSITIVE_INFINITY);

    // res: Infinity
    System.out.println(1.0 / 0.0);

    System.out.println(round(1.5));

    System.out.println("---");

    int max = 10;
    int min = 0;

    // this will generate a random number between 0 and 10 (excluded)
    int randomValue = min + (int) (Math.random() * ((max - min)));

    System.out.println(randomValue);

    System.out.println("---");

    // Big precise numbers
    // use big decimal

  }
}
