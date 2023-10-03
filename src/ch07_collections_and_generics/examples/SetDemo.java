package ch07_collections_and_generics.examples;

import java.util.HashSet;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

public class SetDemo {
  public static void main(String[] args) {
    Set<Integer> set1 = new HashSet<>();
    SortedSet<Integer> set2 = new TreeSet<Integer>();

    System.out.println(set1);

    set1.add(null);
    set1.add(null);
    set1.add(1);
    set1.add(2);
    set1.add(3);
    set1.add(1);

    System.out.println(set1);
    System.out.println(set1.size());
    System.out.println(set1.contains(1));

    System.out.println("---");

    set2.add(1);
    set2.add(2);
    set2.add(3);

    System.out.println(set2);
    System.out.println(set2.subSet(0, 3));
    System.out.println(set2.tailSet(2));
  }
}