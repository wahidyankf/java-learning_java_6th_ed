package ch09_threads.examples;

public class SynchronizationDemo {

  public static void main(String[] args) {

  }

}

class SpeechSynthesizer {
  synchronized void say(String words) {
  }
}

class SpreadSheet {
  int cellA1, cellA2, cellA3;

  synchronized int sumRow() {
    return cellA1 + cellA2 + cellA3;
  }

  synchronized void setRow(int a1, int a2, int a3) {
    cellA1 = a1;
    cellA2 = a2;
    cellA3 = a3;
  }

  // other spreadsheet stuff ...
}