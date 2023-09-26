package ch04_the_java_language.examples;

public class LangTypesPrimitive {
  public static void main(String[] args) {
    int foo = 42;
    System.out.println(foo);

    double d1 = 3.14, d2 = 2 * 3.14;
    System.out.printf("%f %f", d1, d2);

    boolean isFun = true;
    System.out.println(isFun);

    int binaryInt = 0b1001;
    System.out.println(binaryInt);

    int octalInt = 011;
    System.out.println(octalInt);

    int hexInt = 0x11;
    System.out.println(hexInt);

    int withSeparator = 1_000_000;
    System.out.println(withSeparator);
    int withSeparator2 = 1_00_000;
    System.out.println(withSeparator2);

    // ---

    char a = 'a';
    System.out.println(a);

    char unicode = '\u03C0';
    System.out.println(unicode);
  }
}
