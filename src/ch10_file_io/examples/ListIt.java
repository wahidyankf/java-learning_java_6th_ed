package ch10_file_io.examples;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStreamReader;
import java.io.Reader;

/**
 * ListIt
 */
public class ListIt {

  public static void main(String[] args) throws Exception {
    File file = new File(args[0]);

    if (!file.exists() || !file.canRead()) {
      System.out.println("Cannot read " + file);
      return;
    }

    if (file.isDirectory()) {
      String[] files = file.list();
      for (String f : files) {
        System.out.println(f);
      }
    } else {
      try (Reader ir = new InputStreamReader(new FileInputStream(file));
          BufferedReader in = new BufferedReader(ir)) {
        String line;
        while ((line = in.readLine()) != null) {
          System.out.println(line);
        }
      } catch (FileNotFoundException e) {
        System.out.println("File Disappeared");
      }
    }
  }
}