package ch02.examples;

import javax.swing.JFrame;
// import javax.swing.JLabel;

public class HelloJava {
  public static void main(String[] args) {
    JFrame frame = new JFrame("Hello, Java!");
    frame.setSize(300, 150);

    // JLabel label = new JLabel("Hello, Java!", JLabel.CENTER);
    // frame.add(label);

    frame.add(new HelloComponent());

    frame.setVisible(true);
  }
}
