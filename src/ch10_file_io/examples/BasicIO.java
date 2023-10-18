package ch10_file_io.examples;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class BasicIO {
  public static void main(String[] args) {
    InputStream stdin = System.in;
    OutputStream stdout = System.out;
    OutputStream stderr = System.err;

    byte[] buff = new byte[1024];

    try {
      int got = System.in.read(buff);
      System.out.println(got);
    } catch (IOException e) {
      e.printStackTrace();
    }

    try {
      int waiting = System.in.available();
      System.out.println(waiting);
      if (waiting > 0) {
        byte[] data = new byte[waiting];
        System.out.println(data);
      }
    } catch (IOException e) {
      e.printStackTrace();
    }

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