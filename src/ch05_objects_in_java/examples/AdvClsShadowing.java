package ch05_objects_in_java.examples;

public class AdvClsShadowing {
  public static void main(String[] args) {
    DecimalCalculator dc = new DecimalCalculator();

    IntegerCalculator ic = dc;

    int s = ic.sum; // 0
    System.out.println(s);
  }

}

class IntegerCalculator {
  int sum;

  // other integer stuff
}

class DecimalCalculator extends IntegerCalculator {
  double sum;

  // other floating point stuff

  public void interesting(String[] args) {
    double localSum = this.sum;
    int parentSum = super.sum;

    System.out.println(localSum);
    System.out.println(parentSum);
  }
}