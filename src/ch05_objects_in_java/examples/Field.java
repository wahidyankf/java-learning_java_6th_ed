package ch05_objects_in_java.examples;

public class Field {
  Apple a1 = new Apple();
  Apple a2 = new Apple();

  public void setupApples() {
    a1.diameter = 3.0f;
    a1.mass = 5.0f;
    a1.x = 20;
    a1.y = 40;

    a2.diameter = 1000.0f;
    a2.mass = 10.0f;
    a2.x = 70;
    a2.y = 200;
  }

  public void detectCollissions() {
    if (a1.isTouching(a2)) {
      System.out.println("Collision detected!");
    } else {
      System.out.println("Apples are not touching.");
    }
  }

}
