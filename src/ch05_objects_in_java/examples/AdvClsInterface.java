package ch05_objects_in_java.examples;

public class AdvClsInterface {

  public static void main(String[] args) {
    Automobile auto = new Automobile();

    System.out.println(auto.startEngine());
    System.out.println(auto.isEngineRunning());
  }

}

class Automobile implements Driveable {
  // Automobile traits could go here ...

  // build all the Driveable methods
  private boolean notTooCold = true;
  private boolean engineRunning;

  public boolean isEngineRunning() {
    return engineRunning;
  }

  public boolean startEngine() {
    engineRunning = true;
    return notTooCold;
  }

  public void stopEngine() {
    engineRunning = false;
    // ...
  }

  public float accelerate(float acc) {
    // ...
    return 0.0f;
  }

  public boolean turn(Direction dir) {
    // ...
    return true;
  }

  // other automobile stuff
}

interface Driveable {
  boolean startEngine();

  void stopEngine();

  float accelerate(float acc);

  boolean turn(Direction dir);
}

enum Direction {
  LEFT, RIGHT
}