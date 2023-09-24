package ch04.examples;

public class LangLoop {

  public static void main(String[] args) {
    getCountWhile();
    getCountDo();
    getCountFor();
    getCountForEnhanced();
  }

  private static void getCountWhile() {
    System.out.println("While loop:");
    int count = 5;
    while (count > 0) {
      System.out.println("Counting down: " + count);
      count = count - 1;
    }
    System.out.println("Blastoff!");
  }

  private static void getCountDo() {
    System.out.println("Do loop:");
    int count;
    count = 5;
    do {
      System.out.println("Counting down: " + count);
      count = count - 1;
    } while (count > 0);
    System.out.println("Blastoff!");
  }

  public static void getCountFor() {
    System.out.println("For loop:");
    for (int count = 5; count > 0; count = count - 1) {
      System.out.println("Counting down: " + count);
    }
    System.out.println("Blastoff!");

    System.out.println("For loop (2):");
    int x;
    for (x = 5; x > 0; x = x - 1) {
      System.out.println("Counting down: " + x);
    }

    System.out.println("For loop (3):");
    int y = 5;
    for (; y > 0; y = y - 1) {
      System.out.println("Counting down: " + y);
    }
  }

  public static void getCountForEnhanced() {
    System.out.println("Enhanced for loop:");
    int[] numbers = { 5, 4, 3, 2, 1 };
    for (int count : numbers) {
      System.out.println("Counting down: " + count);
    }
    System.out.println("Blastoff!");
  }

}
