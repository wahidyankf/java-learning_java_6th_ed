package ch09_threads.examples;

public class ThreadsStateDemo {
  public static void main(String[] args) {
    Thread[] threads = new Thread[64];

    int num = Thread.enumerate(threads);
    System.out.println(num);

    for (int i = 0; i < num; i++) {
      System.out.println(threads[i].getName() + " " + threads[i].getState());
    }

  }
}