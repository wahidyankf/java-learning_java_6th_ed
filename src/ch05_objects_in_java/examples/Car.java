package ch05_objects_in_java.examples;

public class Car {
  static final int DEFAULT_DOORS = 4;

  String model;
  int doors;

  Car(String model, int doors) {
    this.model = model;
    this.doors = doors;
  }

  Car(String model) {
    this(model, DEFAULT_DOORS);
  }

}
