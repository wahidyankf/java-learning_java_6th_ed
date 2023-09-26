package ch05_objects_in_java.examples;

public class PrintAppleDetails4 {
  public static void main(String[] args) {
    Field f = new Field();
    f.setupApples();
    System.out.println("Apple a1:");
    f.a1.printDetails();
    System.out.println("Apple a2:");
    f.a2.printDetails();

    f.detectCollissions();
  }
}
