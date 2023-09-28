package ch05_objects_in_java.examples;

public class PassingReference {
  int num;
  double weight;

  void printMyDetails() {
    System.out.println(this);
  }

  public static void main(String[] args) {
    PassingReference obj = new PassingReference();

    System.out.println(obj);
    obj.printMyDetails();
  }
}
