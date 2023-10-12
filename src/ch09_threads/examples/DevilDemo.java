package ch09_threads.examples;

public class DevilDemo {

  public static void main(String[] args) {
    Devil devil = new Devil();
    System.out.println(devil);
  }

}

class Devil extends Thread {
  Devil() {
    setDaemon(true);
    start();
  }

  public void run() {
    System.out.println("running");
    try {
      Thread.sleep(5000);
    } catch (InterruptedException e) {
      e.printStackTrace();
    }
    System.out.println("done");

  }
}