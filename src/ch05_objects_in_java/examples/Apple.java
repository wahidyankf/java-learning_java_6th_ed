package ch05_objects_in_java.examples;

public class Apple {
  static float gravAccel = 9.8f;
  static final float EARTH_ACCEL = 9.8f;
  static int SMALL = 0, MEDIUM = 1, LARGE = 2;

  public static void main(String[] args) {
    Apple a1;
    a1 = new Apple();

    Apple a2 = new Apple();

    System.out.println(a1);
    System.out.println(a2);
  }

  float mass;
  float diameter = 1.0f;
  int x, y;
  int size;

  public int getSize() {
    return size;
  }

  public void setSize(int size) {
    this.size = size;
  }

  public void printDetails() {
    System.out.println(" mass: " + mass);
    System.out.println(" diameter: " + diameter);
    System.out.println(" position: (" + x + ", " + y + ")");
  }

  boolean isTouching(Apple other) {
    double xdiff = x - other.x;
    double ydiff = y - other.y;
    double distance = Math.sqrt(xdiff * xdiff + ydiff * ydiff);

    return distance < diameter / 2 + other.diameter / 2;
  }

  float getWeight() {
    return mass * gravAccel;
  }

  void resetEverything() {
    setSize(MEDIUM);
  }

}
