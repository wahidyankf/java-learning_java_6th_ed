package ch04.examples;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class LangVariablesAndConstants {
  public static void main(String[] args) {
    JFrame frame = new JFrame("Hello, Java!");
    JLabel label = new JLabel("Hello, Java!", JLabel.CENTER);
    frame.add(label);
    frame.setSize(300, 300);
    frame.setVisible(true);
  }
}
