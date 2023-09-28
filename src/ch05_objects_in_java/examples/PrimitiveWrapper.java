package ch05_objects_in_java.examples;

import java.util.ArrayList;
import java.util.List;

public class PrimitiveWrapper {
  public static void main(String[] args) {
    Double size = new Double(32.76);

    double d = size.doubleValue();
    float f = size.floatValue();
    long l = size.longValue();
    int i = size.intValue();

    // res: 32.76
    System.out.println(d);
    // res: 32.76
    System.out.println(f);
    // res: 32
    System.out.println(l);
    // res: 32
    System.out.println(i);

    // ------------------------------

    List<Integer> myNumbers = new ArrayList();
    Integer thirtyTree = new Integer(33);
    myNumbers.add(thirtyTree);

    // res: [33]
    System.out.println(myNumbers);
  }

}
