package ch04.examples;

public class LangBranching {

  private static final int MINISCULE = 1;
  private static final int TEENYWEENY = 2;
  private static final int SMALL = 3;
  private static final int MEDIUM = 4;
  private static final int LARGE = 5;
  private static final int EXTRALARGE = 6;

  public static void main(String[] args) {
    int size = 5;
    if (size > 10) {
      doSomethingElse();
      doSomething();
    }

    int value = 2;
    switch (value) {
      case 1:
        System.out.println("value is 1");
        break;
      case 2:
        System.out.println("value is 2");
        break;
      default:
        System.out.println("value is neither 1 nor 2");
        break;
    }

    int mySizeValue = EXTRALARGE;
    String mySize = switch (mySizeValue) {
      case MINISCULE, TEENYWEENY, SMALL -> "Small";
      case MEDIUM -> "Medium";
      case LARGE, EXTRALARGE -> "Large";
      default -> "Unknown";
    };

    System.out.println("Your size is: " + mySize);
  }

  private static void doSomethingElse() {
    System.out.println("doSomethingElse");
  }

  private static void doSomething() {
    System.out.println("doSomething");
  }
}
