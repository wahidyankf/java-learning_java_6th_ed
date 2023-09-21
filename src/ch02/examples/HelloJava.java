package ch02.examples;

import javax.swing.JFrame;
// import javax.swing.JLabel;

public class HelloJava {
  public static void main(String[] args) {
    JFrame frame = new JFrame("Hello, Java!");
    frame.setSize(300, 150);
    frame.add(new HelloComponent());
    frame.setVisible(true);
  }
}
