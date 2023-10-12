package ch09_threads.examples;

public class ThreadsDemo {

  public static void main(String[] args) {
    Animator animator = new Animator();
    Thread myThread = new Thread(animator);
    myThread.start();

    Animator2 animator2 = new Animator2();
    Thread myThread2 = new Thread(animator2);
    myThread2.start();

    try {
      // the current thread
      Thread.sleep(2000);
    } catch (InterruptedException e) {
      e.printStackTrace();
    }

    System.out.println("after 2 second");

  }

}

class Animator implements Runnable {
  boolean animating = true;

  public void run() {
    while (animating) {
      System.out.println("Animating");
      for (int i = 0; i < 10; i++) {
        System.out.print(i);
      }
      animating = false;
      System.out.println("\n");
    }
  }
}

class Animator2 extends Thread {
  boolean animating = true;

  public void run() {
    while (animating) {
      System.out.println("Animating");
      for (int i = 0; i < 10; i++) {
        System.out.print(i);
      }
      animating = false;
      System.out.println("\n");
    }
  }
}