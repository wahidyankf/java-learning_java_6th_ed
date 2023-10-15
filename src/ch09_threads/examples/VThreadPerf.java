package ch09_threads.examples;

import java.util.LinkedList;

public class VThreadPerf {
  public static void main(String args[]) {
    URLQueue queue = new URLQueue();

    int count = 1000000;
    boolean useVirtual = true;
    URLConsumer[] cPool = new URLConsumer[count];
    Thread[] tPool = new Thread[count];

    for (int c = 0; c <= count - 1; c++) {
      cPool[c] = new URLConsumer("C" + c, queue);
    }

    for (int u = 0; u <= count - 1; u++) {
      queue.addURL("https://some.url/at/path/" + u);
    }

    try {
      for (int c = 0; c < count; c++) {
        if (useVirtual) {
          tPool[c] = Thread.startVirtualThread(cPool[c]);
        } else {
          tPool[c] = new Thread(cPool[c]);
          tPool[c].start();
        }
      }
    } catch (OutOfMemoryError oome) {
      System.err.println("Out of memory");
      System.exit(1);
    }

    for (int c = 0; c <= count - 1; c++) {
      cPool[c].setKeepWorking(false);
    }

    try {
      // Now wait for the workers to clean out the queue
      for (int t = 0; t <= count - 1; t++) {
        tPool[t].join();
      }
    } catch (InterruptedException ie) {
      System.err.println("Interrupted waiting for consumers to finish");
    }

    System.out.println(queue.urlQueue.size() + " urls left in queue");
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
        Thread.sleep(1000);
      } catch (InterruptedException ie) {
        System.err.println("Consumer " + consumerID +
            " interrupted. Quitting.");
        break;
      }
    }
  }
}