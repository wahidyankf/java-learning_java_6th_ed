package ch02_a_first_application.examples;

import javax.swing.*;

public class HelloJava2 {
  public static void main(String[] args) {
    JFrame frame = new JFrame("HelloJava2");
    frame.add(new HelloComponent2("Hello, Java!"));
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setSize(300, 300);
    frame.setVisible(true);
  }
}
