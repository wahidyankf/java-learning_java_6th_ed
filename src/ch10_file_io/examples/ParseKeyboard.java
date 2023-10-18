package ch10_file_io.examples;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.text.NumberFormat;
import java.text.ParseException;

/**
 * ParseKeyboard
 */
public class ParseKeyboard {

  public static void main(String[] args) {

    try {
      InputStream in = System.in;
      InputStreamReader charsIn = new InputStreamReader(in);
      BufferedReader bufferedCharsIn = new BufferedReader(charsIn);

      String line = bufferedCharsIn.readLine();
      int i = NumberFormat.getInstance().parse(line).intValue();

      System.out.println(i);
    } catch (IOException e) {
      e.printStackTrace();
    } catch (ParseException pe) {
      pe.printStackTrace();
    }

  }
}