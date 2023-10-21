package ch10_file_io.examples;

import java.io.FileInputStream;
import java.io.IOException;

/**
 * FileStream
 */
public class FileStream {

  public static void main(String[] args) {
    try (FileInputStream in = new FileInputStream("/etc/motd")) {
    } catch (IOException e) {
      System.out.println("Error: " + e.getMessage());
    }
  }

}
