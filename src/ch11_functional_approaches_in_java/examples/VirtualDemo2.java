package ch11_functional_approaches_in_java.examples;

/**
 * VirtualDemo2
 */
public class VirtualDemo2 {
  public static void main(String[] args) throws Exception {
    Runnable runnable = new Runnable() {
      public void run() {
        System.out.println("Hello thread using Runnable class! ID: " + Thread.currentThread().threadId());
      }
    };

    Thread t = Thread.startVirtualThread(runnable);

    Thread t2 = Thread
        .startVirtualThread(
            () -> System.out.println("Hello thread using lambda! ID: " + Thread.currentThread().threadId()));

    t.join();
    t2.join();
  }
}