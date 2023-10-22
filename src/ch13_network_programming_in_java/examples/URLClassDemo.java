package ch13_network_programming_in_java.examples;

import java.net.URI;
import java.net.URL;

/**
 * URLClassDemo
 */
public class URLClassDemo {
  public static void main(String[] args) {
    try {
      // deprecated
      URL aDoc = new URL("http://foo.bar.com/documents/homepage.html");
      // deprecated
      URL sameDoc = new URL("http", "foo.bar.com", "/documents/homepage.html");

      // new way
      URI newWay = URI.create("http://foo.bar.com/documents/homepage.html");

      System.out.println(aDoc);
      System.out.println(sameDoc);
      System.out.println(newWay);
    } catch (Exception e) {
      System.out.println("Error: " + e.getMessage());
    }
  }
}