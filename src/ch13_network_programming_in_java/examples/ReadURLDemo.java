package ch13_network_programming_in_java.examples;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;

/**
 * ReadURLDemo
 */
public class ReadURLDemo {

  public static void main(String[] args) {
    try {

      URL url = new URL("http://ayokoding.com");

      BufferedReader bin = new BufferedReader(new InputStreamReader(url.openStream()));

      String result = "";
      String line;
      while ((line = bin.readLine()) != null) {
        System.out.println(line);
        result += line;
      }

      System.out.println("\nthe result: \n");
      System.out.println(result);

    } catch (IOException e) {
      System.out.println("Error: " + e.getMessage());
    }

  }
}