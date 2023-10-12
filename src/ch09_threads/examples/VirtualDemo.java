package ch09_threads.examples;

// this need to be run with preview flag 

public class VirtualDemo {
  public static void main(String args[]) throws Exception {
    Runnable runnable = new Runnable() {
      public void run() {
        Thread t = Thread.currentThread();
        System.out.println("Hello thread! " +
            (t.isVirtual() ? "virtual " : "platform ") +
            "ID: " + t.threadId());
      }
    };
    Thread thread1 = new Thread(runnable);
    thread1.start();
    Thread thread2 = Thread.startVirtualThread(runnable);
    thread1.join();
    thread2.join();
  }
}
