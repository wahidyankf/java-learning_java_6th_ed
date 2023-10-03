package ch06_error_handling.examples;

public class WorkingWithAssertions {
  public static void main(String[] args) {
    int a = 1;

    // assertion need to be enabled with -ea
    assert a == 10 : a;

  }

}
