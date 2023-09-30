package ch05_objects_in_java.examples;

public class AdvClsAbstract {

  public static void main(String[] args) {
    Catt cat = new Catt();

    // res: 3.0
    System.out.println(cat.getWeight());
    // res: Meow! Meow! Meow!
    cat.makeSound(3);
  }

}

abstract class Animall {
  private double weight;

  public double getWeight() {
    return weight;
  }

  public void setWeight(double weight) {
    this.weight = weight;
  }

  public abstract void makeSound(int duration);

}

class Catt extends Animall {
  public Catt() {
    System.out.println("Cat constructor");
    this.setWeight(3.0f);
  }

  public void makeSound(int duration) {
    for (int count = 0; count < duration; count++) {
      System.out.println("Meow!");
    }
  }
}