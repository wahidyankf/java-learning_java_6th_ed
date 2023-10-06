package ch07_collections_and_generics.examples;

import java.sql.Date;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class CastingDemo {

  public static void main(String[] args) {
    List<Date> list = new ArrayList<Date>();

    Collection<Date> cd = new ArrayList<Date>();
    List<Date> ld = (List<Date>) cd;

    System.out.println(list);
    System.out.println(ld);
  }
}
