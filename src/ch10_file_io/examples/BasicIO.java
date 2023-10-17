package ch10_file_io.examples;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class BasicIO {
  public static void main(String[] args) {
    InputStream stdin = System.in;
    OutputStream stdout = System.out;
    OutputStream stderr = System.err;

    try {
      int val;
      while ((val = stdin.read()) != -1) {
        stdout.write(val);
      }
    } catch (IOException e) {
      //
    }

  }
}