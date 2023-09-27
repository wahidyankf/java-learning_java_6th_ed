package ch05_objects_in_java.examples;

public class Bird {
  int xPos, yPos;

  double fly(int x, int y) {
    double distance = Math.sqrt(x * x + y * y);

    flap(distance);

    xPos = x;
    yPos = y;
    return distance;
  }

  private void flap(double distance) {
    System.out.println("Flapping wings " + distance + " units.");
  }

}
