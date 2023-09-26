package ch05_objects_in_java.examples;

public class PrintAppleDetails2 {
  public static void main(String[] args) {
    Apple a1 = new Apple();

    // Apple a1:
    // mass: 0.0
    // diameter: 1.0
    // position: (0, 0)
    System.out.println("Apple a1:");
    System.out.println(" mass: " + a1.mass);
    System.out.println(" diameter: " + a1.diameter);
    System.out.println(" position: (" + a1.x + ", " + a1.y + ")");

    // fill in some information on a1
    a1.mass = 10.0f;
    a1.x = 20;
    a1.y = 42;

    // Updated a1:
    // mass: 10.0
    // diameter: 1.0
    // position: (20, 42)
    System.out.println("Updated a1:");
    System.out.println(" mass: " + a1.mass);
    System.out.println(" diameter: " + a1.diameter);
    System.out.println(" position: (" + a1.x + ", " + a1.y + ")");
  }

}
