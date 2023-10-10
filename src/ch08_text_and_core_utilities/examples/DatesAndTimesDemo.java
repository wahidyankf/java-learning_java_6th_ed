package ch08_text_and_core_utilities.examples;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class DatesAndTimesDemo {

  public static void main(String[] args) {
    // res: 2023-10-10
    System.out.println(LocalDate.now());

    // res: 2019-05-04
    System.out.println(LocalDate.of(2019, 5, 4));

    // res: 07:15
    System.out.println(LocalTime.of(7, 15));

    // res: 07:15
    System.out.println(LocalTime.parse("07:15"));

    // res: 2019-05-04T07:15
    System.out.println(LocalDateTime.of(2019, 5, 4, 7, 15));

    // res: 2019-05-04T07:15
    System.out.println(LocalDateTime.parse("2019-05-04T07:15", null));

    // date comparison
  }

}