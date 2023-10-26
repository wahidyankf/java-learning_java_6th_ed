package ch11_functional_approaches_in_java.examples;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.DoubleStream;

/**
 * MappingDemo
 */
public class MappingDemo {

  public static void main(String[] args) {

    System.out.println("------");
    System.out.println("Stream mapping");

    double[] prices = { 1.99, 2.49, 1.99, 49.99, 19.99, 9.99, 29.99 };
    // res: 1.99, 2.49, 1.99, 49.99, 19.99, 9.99, 29.99
    System.out.println("> original prices");
    DoubleStream.of(prices).forEach(System.out::println);
    System.out.println("> multiply by 0.8");
    DoubleStream.of(prices).map(p -> p * 0.8).forEach(System.out::println);
    System.out.println("> sum of prices");
    System.out.println(DoubleStream.of(prices).map(p -> p * 0.8).sum());

    System.out.println("------");
    System.out.println("Stream mapping with objects");

    Report r = new Report();
    r.buildEmployeeList();
    r.publishNames();

    System.out.println("------");
    System.out.println("Mapping conversions");

    r.publishBudget();

    System.out.println("------");
    System.out.println("Flatmaps");

  }
}

class Report {
  List<PaidEmployee> employees = new ArrayList<>();

  void buildEmployeeList() {
    employees.add(new PaidEmployee("Fozzie", 4, 30_000));
    employees.add(new PaidEmployee("Gonzo", 2, 50_000));
    employees.add(new PaidEmployee("Kermit", 1, 60_000));
    employees.add(new PaidEmployee("Piggy", 3, 80_000));
  }

  public void publishNames() {
    employees.stream().map(e -> e.getName()).forEach(System.out::println);
  }

  public void publishBudget() {
    int b = employees.stream().mapToInt(e -> e.getSalary()).sum();
    System.out.println("Total budget: " + b);
  }
}

class PaidEmployee {
  private int id;
  private String name;
  private int salary; // annual, in whole dollars

  public PaidEmployee(String fullname, int id, int salary) {
    this.name = fullname;
    this.id = id;
    this.salary = salary;
  }

  public String getName() {
    return name;
  }

  public int getID() {
    return id;
  }

  public int getSalary() {
    return salary;
  }
}