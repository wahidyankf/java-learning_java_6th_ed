package ch05_objects_in_java.examples;

public class LocalVariable {
  int foo;

  void myMethod() {
    int bar = 0;

    foo += 1;
    // bar += 1;

    bar = 99;
    bar += 1;

    System.out.println("foo: " + foo);
    System.out.println("bar: " + bar);
  }
}
