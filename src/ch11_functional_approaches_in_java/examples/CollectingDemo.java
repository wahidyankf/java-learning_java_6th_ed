package ch11_functional_approaches_in_java.examples;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.function.DoubleUnaryOperator;
import java.util.stream.Stream;

/**
 * CollectingDemo
 */
public class CollectingDemo {

  public static void main(String[] args) {

    System.out.println("------");
    System.out.println("Collecting");

    List<String> names = new ArrayList<>();
    names.add("Kermit");
    names.add("Fozzie");
    names.add("Gonzo");
    names.add("Piggy");

    // res: [Kermit, Fozzie, Gonzo, Piggy]
    System.out.println(names);

    // names that contain the letter 'o', take first
    Optional<String> matched = names.stream().filter(n -> n.indexOf("o") > -1).findFirst();
    // res: Optional[Fozzie]
    System.out.println(matched);

    // names that contain the letter 'x', take first
    Optional<String> matched2 = names.stream().filter(n -> n.indexOf("x") > -1).findFirst();
    // res: N/A
    System.out.println(matched2.isPresent() ? matched2.get() : "N/A");

    System.out.println("------");
    System.out.println("custom reducer");

    BigInteger one = BigInteger.ONE;
    Stream.iterate(one, count -> count.add(one)).limit(12);

    System.out.println("original");
    Stream.iterate(one, count -> count.add(one)).limit(12)
        .forEach(System.out::println);

    System.out.println(
        "reduced\n" + Stream.iterate(one, count -> count.add(one)).limit(12).reduce(one, (a, b) -> a.multiply(b)));

    System.out.println("------");
    System.out.println("using collectors");

    List<String> onames = names.stream().filter(n -> n.indexOf("o") > -1).toList();
    System.out.println(onames);

    List<BigInteger> bigInts = Stream.iterate(one, count -> count.add(one)).limit(12).toList();
    System.out.println(bigInts);

    bigInts.stream().forEach(System.out::println);
    System.out.println("> --");
    // we are able to do this.
    bigInts.stream().forEach(System.out::println);

    System.out.println("------");

    double sample = 70.2;

    System.out.println("Initial reading: " + sample);
    System.out.println("Adding 3: " + adjust(sample, x -> x + 3));
    System.out.println("Reducing by 10%: " + adjust(sample, x -> x * 0.9));
    System.out.println("Reducing by 10% and adding 3: " + adjust(sample, x -> (x * 0.9) + 3));

  }

  static double adjust(double val, DoubleUnaryOperator adjustment) {
    return adjustment.applyAsDouble(val);
  }
}