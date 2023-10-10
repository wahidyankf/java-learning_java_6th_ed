package ch08_text_and_core_utilities.examples;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexDemo {

  public static void main(String[] args) {
    String sample = "my.name@some.domain";

    Boolean validEmail = Pattern.matches(".*@.*", sample);
    // res: true
    System.out.println(validEmail);

    System.out.println("---");

    Boolean validEmail2 = Pattern.matches("[^@]+@[^@]+\\.(com|org|net)", sample);
    // res: false
    System.out.println(validEmail2);

    System.out.println("---");

    String myText = "Lots of text with hyperlinks and stuff ...";
    Pattern urlPattern = Pattern.compile("https?://[\\w./]*");
    Matcher matcher = urlPattern.matcher(myText);

    System.out.println(matcher);

    System.out.println("---");

    String text = "A horse is a horse, of course of course...";
    String pattern = "horse|course";

    Matcher matcher2 = Pattern.compile(pattern).matcher(text);
    while (matcher2.find()) {
      System.out.println(matcher2);
      System.out.println(
          "Matched: '" + matcher2.group() + "' at position " + matcher2.start());
    }

    System.out.println("---");

    String textSplit = "Foo, bar , blah";
    String[] badFields = textSplit.split(",");
    String[] goodFields = textSplit.split("\\s*,\\s*");

    for (String field : badFields) {
      System.out.println(field);
    }
    for (String field : goodFields) {
      System.out.println(field);
    }
  }
}