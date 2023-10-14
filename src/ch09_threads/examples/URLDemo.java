package ch09_threads.examples;

import java.util.LinkedList;

public class URLDemo {
  public static void main(String args[]) {
    URLQueue queue = new URLQueue();
    URLProducer p1 = new URLProducer("P1", 10, queue);
    URLProducer p2 = new URLProducer("P2", 10, queue);
    URLConsumer c1 = new URLConsumer("C1", queue);
    URLConsumer c2 = new URLConsumer("C2", queue);

    System.out.println("Starting...");
    Thread tp1 = new Thread(p1);
    tp1.start();
    Thread tp2 = new Thread(p2);
    tp2.start();
    Thread tc1 = new Thread(c1);
    tc1.start();
    Thread tc2 = new Thread(c2);
    tc2.start();
    try {
      // Wait for the producers to finish creating urls
      tp1.join();
      tp2.join();
    } catch (InterruptedException ie) {
      System.err.println("Interrupted waiting for producers to finish");
    }

    c1.setKeepWorking(false);
    c2.setKeepWorking(false);

    try {
      // Now wait for the workers to clean out the queue
      tc1.join();
      tc2.join();
    } catch (InterruptedException ie) {
      System.err.println("Interrupted waiting for consumers to finish");
    }
    System.out.println("Done");
  }
}

class URLQueue {
  LinkedList<String> urlQueue = new LinkedList<String>();

  public synchronized void addURL(String url) {
    urlQueue.add(url);
  }

  public synchronized String getURL() {
    if (!urlQueue.isEmpty()) {
      return urlQueue.removeFirst();
    }
    return null;
  }

  public boolean isEmpty() {
    return urlQueue.isEmpty();
  }
}

class URLProducer implements Runnable {
  private int urlCount;
  private URLQueue queue;
  private String producerID;

  public URLProducer(String producerID, int urlCount, URLQueue queue) {
    this.urlCount = urlCount;
    this.producerID = producerID;
    this.queue = queue;
  }

  public void run() {
    for (int i = 1; i <= urlCount; i++) {
      String url = "https://some.url/at/path/" + i;
      queue.addURL(producerID + " " + url);
      System.out.println(producerID + " produced " + url);
      try {
        // Thread.sleep(delay.nextInt(500));
        Thread.sleep(500);
      } catch (InterruptedException ie) {
        System.err.println("Producer " + producerID + " interrupted. Quitting.");
        break;
      }
    }
  }
}

class URLConsumer implements Runnable {
  private boolean keepWorking = true;
  private URLQueue queue;
  private String consumerID;

  public URLConsumer(String consumerID, URLQueue queue) {
    this.consumerID = consumerID;
    this.queue = queue;
  }

  public void setKeepWorking(boolean keepWorking) {
    this.keepWorking = keepWorking;
  }

  public void run() {
    System.out.println(consumerID + " started");
    while (keepWorking || !queue.isEmpty()) {
      String url = queue.getURL();
      if (url != null) {
        System.out.println(consumerID + " consumed " + url);
      } else {
        System.out.println(consumerID + " skipped empty queue");
      }
      try {
        // Thread.sleep(delay.nextInt(1000));
        Thread.sleep(1000);
      } catch (InterruptedException ie) {
        System.err.println("Consumer " + consumerID +
            " interrupted. Quitting.");
        break;
      }
    }
  }
}