package ch04.examples;

public class LangArray {
  public static void main(String[] args) {
    int[] arrayOfInts;
    String[] someStrings;

    int number = 10;
    arrayOfInts = new int[42];
    someStrings = new String[number + 2];
    double[] someNumbers = new double[20];

    // res: 42
    System.out.println(arrayOfInts.length);
    // res: 12
    System.out.println(someStrings.length);
    // res: 20
    System.out.println(someNumbers.length);

    // will print 0s because arrays are initialized with 0s
    for (int i : arrayOfInts) {
      System.out.println(i);
    }

    // will print nulls because arrays are initialized with nulls
    for (String s : someStrings) {
      System.out.println(s);
    }

    int[] primes = { 2, 3, 5, 7, 7 + 4 };
    // will print 2, 3, 5, 7, 11
    for (int i : primes) {
      System.out.println(i);
    }
    // res: 3
    System.out.println(primes[1]);

    String[] names = { "John", "Paul", "George", "Ringo" };
    // will print John, Paul, George, Ringo
    for (String name : names) {
      System.out.println(name);
    }

    try {
      // will throw ArrayIndexOutOfBoundsException
      System.out.println(names[5]);
    } catch (ArrayIndexOutOfBoundsException e) {
      System.out.println(e.getMessage());
    }
  }
}
