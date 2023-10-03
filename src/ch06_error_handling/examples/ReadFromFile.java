package ch06_error_handling.examples;

import java.io.IOException;

import javax.swing.tree.ExpandVetoException;

public class ReadFromFile {
  public static void main(String[] args) {
    try {
      readFromFile("foo");
    } catch (Exception e) {
      System.out.println("Exception caught: " + e);
    }

    System.out.println("---");

    try {
      openConnection();
    } catch (ExpandVetoException e) {
      e.printStackTrace();
    } catch (IOException e) {
      e.printStackTrace();
    } catch (MyException e) {
      e.printStackTrace();
    } catch (MyException2 e) {
      e.printStackTrace();
    }

    System.out.println("---");

    try {
      // complex, deeply nested task
    } catch (Exception e) {
      // handle exception
      e.printStackTrace(System.err);
    }

    System.out.println("---");

    try {
      checkRead(null);
    } catch (SecurityException e) {
      System.out.println(e.getMessage());
    }

    System.out.println("---");

    // get some input from a file and parse it
    try {
      Object input = null;
      parseStream(input);
    } catch (ParseException pe) {
      // bad input... we can even tell them which line was bad!
      System.out.println("Error on line " + pe.getLineNumber());
    } catch (IOException ioe) {
      // other, low-level communication problems
    }

    System.out.println("---");

    try {
      // Do something here
      System.out.println("Doing something... for finally...");
      throw new MyRuntimeException("MyRuntimeException");
    } catch (Exception e) {
      System.out.println("Exception caught: " + e);
    } finally {
      // Always do this
      System.out.println("Always do this...");
    }

    System.out.println("---");

    // try-with-resources
    // resource will be closed automatically after the try block
    // MyResource implements AutoCloseable
    try (MyResource resource = new MyResource()) {
      resource.doSomething();
    } catch (Exception e) {
      System.out.println("Exception caught: " + e);
    }

    System.out.println("Program finished...");
  }

  // this exception might be non-sense, but it's just an example
  // RuntimeExceptions are unchecked exceptions
  private static void openConnection()
      throws IOException, ExpandVetoException, MyException, MyException2, RuntimeException, MyRuntimeException {

  }

  private static void checkRead(String s) throws SecurityException {
    // ...
    if (s == null) {
      throw new SecurityException("Null string");
    }
  }

  private static void readFromFile(String string) throws Exception {
  }

  private static void parseStream(Object input) throws ParseException, IOException {
    // ...
    throw new ParseException("Parse error", 42);
  }

}

class ParseException extends Exception {
  private int lineNumber;

  ParseException() {
    super();
    this.lineNumber = -1;
  }

  ParseException(String desc, int lineNumber) {
    super(desc);
    this.lineNumber = lineNumber;
  }

  public int getLineNumber() {
    return lineNumber;
  }
}

class MyException extends Throwable {
  public MyException(String message) {
    super(message);
  }
}

class MyException2 extends Exception {
  public MyException2(String message) {
    super(message);
  }
}

class MyRuntimeException extends RuntimeException {
  public MyRuntimeException(String message) {
    super(message);
  }
}

class MyResource implements AutoCloseable {
  public void doSomething() throws Exception {
    // ...
  }

  @Override
  public void close() throws Exception {
    // ...
  }
}