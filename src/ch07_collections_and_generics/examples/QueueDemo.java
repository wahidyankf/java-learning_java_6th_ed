package ch07_collections_and_generics.examples;

import java.util.LinkedList;
import java.util.Queue;

public class QueueDemo {
  public static void main(String[] args) {
    // create new queue
    Queue<Integer> queue = new LinkedList<Integer>();

    // res: []
    System.out.println(queue);
    queue.add(1);
    queue.add(2);
    queue.add(3);
    // res: [1, 2, 3]
    System.out.println(queue);

    // res: 1
    System.out.println(queue.peek());
    // res: 1
    System.out.println(queue.poll());
    // res: [2, 3]
    System.out.println(queue);
  }
}
