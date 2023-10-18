package ch10_file_io.examples;

import java.io.File;

/**
 * JavaIOFiles
 */
public class JavaIOFiles {

  public static void main(String[] args) {
    File parseKeyFile = new File("ParseKey.java");
    System.out.println(parseKeyFile);

    File fooFile = new File("foo.txt");
    // res: false
    System.out.println(fooFile.exists());
    // res: true
    System.out.println(parseKeyFile.exists());

    String currentDir = System.getProperty("user.dir");
    System.out.println(currentDir);

    File currentDirFile = new File(currentDir, "ParseKey.java");
    System.out.println(currentDirFile);

    System.out.println("-----");

    System.out.println("File separator: " + File.separatorChar);

    // we'll use forward slash as our standard
    String path = "mail/2023/june";
    path = path.replace('/', File.separatorChar);
    File mailbox = new File(path);

    System.out.println(mailbox);
  }
}