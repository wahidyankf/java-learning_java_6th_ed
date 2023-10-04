package ch07_collections_and_generics.examples;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class ListDemo {
  public static void main(String[] args) {
    ArrayList<Integer> list = new ArrayList<Integer>();

    list.add(1);
    list.add(2);
    // res: [1, 2]
    System.out.println(list);

    list.remove(0);
    // res: [2]
    System.out.println(list);

    list.add(0, 1);
    // res: [1, 2]
    System.out.println(list);

    // res: 2
    System.out.println(list.get(1));
    // res: 2
    System.out.println(list.size());

    try {
      System.out.println(list.get(2));
    } catch (Exception e) {
      System.out.println("Exception: " + e);
    }

    // res: true
    System.out.println(list.contains(1));

    // map list and multiply it by 2
    System.out.println("map list and multiply it by 2");
    list.replaceAll(x -> x * 2);
    System.out.println(list);

    // map list and multiply it by 2 immutably
    System.out.println("map list and multiply it by 2 immutably");
    System.out.println("original list: " + list);
    List<Integer> newList = list.stream().map(x -> x * 2).collect(Collectors.toList());
    System.out.println("result list: " + newList);
    System.out.println("original list: " + list);
  }
}
