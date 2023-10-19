package ch10_file_io.examples;

import java.io.File;
import java.io.IOException;

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

    System.out.println("-----");

    String[] filePath = { "mail", "2023", "june", "merle" };

    StringBuffer sb = new StringBuffer(filePath[0]);
    for (int i = 1; i < filePath.length; i++) {
      sb.append(File.separator + filePath[i]);
    }
    File mailbox2 = new File(sb.toString());

    System.out.println(mailbox2);

    System.out.println("-----");

    File testFile = new File("src/ch10_file_io/examples/BasicIO.java");

    System.out.println("testFile: " + testFile);

    System.out.println("exists: " + testFile.exists());
    System.out.println("can read: " + testFile.canRead());

    System.out.println("name: " + testFile.getName());
    System.out.println("extension: " + testFile.getName().substring(testFile.getName().lastIndexOf('.')));
    System.out.println("length: " + testFile.length() + " bytes");

    System.out.println("is file: " + testFile.isFile());
    System.out.println("is directory: " + testFile.isDirectory());
    System.out.println("is file: " + testFile.isFile());
    System.out.println("is hidden: " + testFile.isHidden());
    System.out.println("last modified: " + testFile.lastModified());
    System.out.println("is relative: " + !testFile.isAbsolute());
    System.out.println("is absolute: " + testFile.isAbsolute());
    System.out.println("absolute path: " + testFile.getAbsolutePath());

    System.out.println("-----");

    File testDir = new File("src/ch10_file_io/examples");

    System.out.println("testDir: " + testDir);
    System.out.println("is directory: " + testDir.isDirectory());

    String[] contents = testDir.list();
    System.out.println("contents quantity: " + contents.length);

    System.out.println("contents: ");
    File[] files = testDir.listFiles();
    for (File file : files) {
      System.out.println("- " + file.getName());
    }

    System.out.println("-----");

    File newFilename = new File("src/ch10_file_io/examples/Foo.txt");
    try {
      newFilename.createNewFile();
    } catch (IOException e) {
      e.printStackTrace();
    }

    System.out.println(newFilename.exists());

  }
}