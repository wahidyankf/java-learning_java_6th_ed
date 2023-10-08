package ch08_text_and_core_utilities.examples;

import java.util.Date;

public class StringDemo {

  public static void main(String[] args) {
    String quote = "To be or not to be";
    int length = quote.length();
    boolean empty = quote.isEmpty();

    System.out.println("length: " + length);
    System.out.println("empty: " + empty);

    String poem = """
        Twas brillig, and the slithy toves
          Did gyre and gimble in the wabe;
        All mimsy were the borogoves,
          And the mome raths outgrabe.
        """;
    System.out.println(poem);

    System.out.println("---");

    char[] data = new char[] { 'a', 'b', 'c' };
    String lemming = new String(data);
    System.out.println(lemming);

    System.out.println("---");

    String s = "Hello";
    for (int i = 0; i < s.length(); i++) {
      System.out.println(s.charAt(i));
    }
    System.out.println("---");
    for (char c : s.toCharArray()) {
      System.out.println(c);
    }

    System.out.println("---");

    System.out.println("String from things");
    System.out.println(String.valueOf(1));
    System.out.println(String.valueOf(false));
    System.out.println(String.valueOf(2.384f));

    Date date = new Date();
    String d1 = String.valueOf(date);
    String d2 = date.toString();

    date = null;
    d1 = String.valueOf(date);
    // null pointer access: the variable date can only be null at this location
    // d2 = date.toString();

    System.out.println(d1);
    System.out.println(d2);

    System.out.println("---");
    // comparing strings

    String one = "FOO";
    String two = "foo";
    String three = "foo";
    String four = String.valueOf(new char[] { 'f', 'o', 'o' });

    // res: false
    System.out.println(one == two);
    // res: true
    System.out.println(two == three);

    // res: false
    System.out.println(one.equals(two));
    // res: true
    System.out.println(three.equals(two));
    // res: true
    System.out.println(two.equals(three));

    // res: false
    System.out.println(three == four);
    // res: true
    System.out.println(three.equals(four));

    System.out.println("---");

    // String comparison

    String abc = "abc";
    String def = "def";
    String num = "123";

    // res: -3
    System.out.println(abc.compareTo(def));
    // res: true
    System.out.println(abc.compareTo(def) < 0);
    // res: 0
    System.out.println(abc.compareTo(abc));
    // res: true
    System.out.println(abc.compareTo(abc) == 0);
    // res: 48
    System.out.println(abc.compareTo(num));
    // res: true
    System.out.println(abc.compareTo(num) > 0);
  }
}