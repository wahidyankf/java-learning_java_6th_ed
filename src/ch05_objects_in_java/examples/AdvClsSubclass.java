package ch05_objects_in_java.examples;

public class AdvClsSubclass {

}

class Animal2 {
  float weight;

  void eat() {
    // do eating stuff
  }
  // other animal stuff
}

class Mammal extends Animal2 {
  // inherits weight
  int heartRate;

  // inherits eat()
  void breathe() {
    // respire
  }
}

class Cat extends Mammal {
  // inherits weight and heartRate
  boolean longHair;

  // inherits eat() and breathe()
  void purr() {
    // make nice sounds
  }
}