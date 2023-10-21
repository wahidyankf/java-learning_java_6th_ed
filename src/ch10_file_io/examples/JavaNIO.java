package ch10_file_io.examples;

import java.io.IOException;
import java.net.URI;
import java.nio.file.FileSystem;
import java.nio.file.FileSystems;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.HashMap;
import java.util.Map;

/**
 * JavaNIO
 */
public class JavaNIO {

  public static void main(String[] args) {
    // The default host computer filesystem
    FileSystem fs = FileSystems.getDefault();

    // A custom filesystem for ZIP files, no special properties
    Map<String, String> props = new HashMap<>();
    URI zipURI = URI.create("jar:file:/Users/wkf/tmp/MyArchive.zip");
    try (FileSystem zipfs = FileSystems.newFileSystem(zipURI, props)) {
    } catch (IOException e) {
      System.out.println("Error creating zip file system: " + e.getMessage());
    }

    System.out.println(fs);

    System.out.println("------");

    Path wkfPath = fs.getPath("/Users/wkf/");
    Path wkfTmp = wkfPath.resolve("tmp");

    // res: /Users/wkf/tmp
    System.out.println(wkfTmp);

    Path tmpPath = fs.getPath("tmp");
    Path wkfTmp2 = wkfPath.resolve(tmpPath);

    // res: /Users/wkf/tmp
    System.out.println(wkfTmp2);

    Path absPath = wkfPath.resolve("/tmp");

    // res: /tmp
    System.out.println(absPath);

    Path sibPath = wkfPath.resolveSibling("sib");

    // res: /Users/sib
    System.out.println(sibPath);

    System.out.println("------");

    Path currentRelativePath = Paths.get("");
    // res: current project path (absolute)
    System.out.println(currentRelativePath.toAbsolutePath());

  }
}