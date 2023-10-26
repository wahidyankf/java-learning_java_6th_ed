package ch11_functional_approaches_in_java.examples;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Random;
import java.util.function.Consumer;
import java.util.function.IntFunction;
import java.util.function.Supplier;
import java.util.stream.IntStream;
import java.util.stream.Stream;

/**
 * LambdaDemo
 */
public class LambdaDemo {

  public static void main(String[] args) {
    IntFunction<String> inc = x -> "You entered: " + x;
    // res: You entered: 5
    System.out.println(inc.apply(5));

    System.out.println("------");
    System.out.println("Consumer and Supplier examples");

    Consumer<Integer> cExample = x -> System.out.println("You entered: " + x);
    // res: You entered: 1
    cExample.accept(1);

    Supplier<String> sExample = () -> "Hello World!";
    // res: Hello World!
    System.out.println(sExample.get());

    System.out.println("------");
    System.out.println("forEach examples");

    int[] anArray = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
    Arrays.stream(anArray).forEach((i) -> System.out.println(i));

    List<String> names = Arrays.asList("John", "Jane", "Mary", "Steve", "Joe");
    // res: John, Jane, Mary, Steve, Joe
    names.forEach(n -> System.out.println(n));
    // res: John, Jane, Mary, Steve, Joe
    names.forEach(System.out::println);

    System.out.println("------");
    System.out.println("sorting using lambda");

    Collections.sort(names, (a, b) -> a.compareTo(b));
    // res: [Jane, Joe, John, Mary, Steve]
    System.out.println(names);

    Collections.sort(names, (a, b) -> b.compareTo(a));
    // res: [Steve, Mary, John, Joe, Jane]
    System.out.println(names);

    System.out.println("------");
    System.out.println("streams and lambda");

    System.out.println(names.stream().count());
    names.stream().forEach(System.out::println);

    // res: 42, 42, 42
    Stream.generate(() -> 42).limit(3).forEach(System.out::println);

    System.out.println("------");
    System.out.println("stream generation: random weekdays");

    // res: random string of weekdays
    Stream.generate(new WeekDayGenerator())
        .limit(5)
        .forEach(System.out::println);

    System.out.println("------");
    System.out.println("stream iterators");

    // res: 1, 2, 3, 4, 5
    System.out.println("> Int Stream");
    IntStream.iterate(1, i -> i + 1).limit(5).forEach(System.out::println);
    System.out.println("> Custom Stream");
    Stream.iterate(LocalDate.now(), d -> d.plus(1, ChronoUnit.DAYS))
        .limit(5)
        .forEach(System.out::println);

    System.out.println("------");
    System.out.println("filtering");

    System.out.println("names starting with J");
    names.stream()
        .filter(n -> n.startsWith("J"))
        .forEach(System.out::println);

  }
}

class WeekDayGenerator implements Supplier<String> {
  private static String[] days = { "Sun", "Mon", "Tue", "Wed", "Thu", "Fri", "Sat" };
  private Random randSrc = new Random();

  public String get() {
    return days[randSrc.nextInt(days.length)];
  }
}