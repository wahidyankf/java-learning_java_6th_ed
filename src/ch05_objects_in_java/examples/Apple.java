package ch05_objects_in_java.examples;

public class Apple {
  static float gravAccel = 9.8f;
  static final float EARTH_ACCEL = 9.8f;
  public static final int SMALL = 0;
  public static final int MEDIUM = 1;
  public static final int LARGE = 2;

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

  public static String[] getAppleSizes() {
    // return the names of our constants
    return new String[] { "SMALL", "MEDIUM", "LARGE" };
  }

  public void setSize(int size) {
    this.size = size;
  }

  public void printDetails() {
    System.out.println(" mass: " + mass);
    String[] niceNames = getAppleSizes();
    if (diameter < 5.0f) {
      System.out.println(niceNames[SMALL]);
    } else if (diameter < 10.0f) {
      System.out.println(niceNames[MEDIUM]);
    } else {
      System.out.println(niceNames[LARGE]);
    }

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

  public void moveTo(int x, int y) {
    System.out.println("Moving apple to " + x + ", " + y);

    this.x = x;

    // store the new y value if it is high enough
    if (y > diameter) {
      this.y = y;
    } else {
      // otherwise set y to the height of the apple
      this.y = (int) diameter;
    }
  }
}
