package ch04.examples;

public class LangString {
  public static void main(String[] args) {
    System.out.println("Hello, World..");

    String s = "I am the walrus...";
    String t = "John said: \"I am the walrus...\"";
    System.out.println(s);
    System.out.println(t);

    String quote = "Fourscore and " + "seven years ago,";
    String more = quote + " our" + " fathers" + " brought...";
    System.out.println(more);
  }
}
