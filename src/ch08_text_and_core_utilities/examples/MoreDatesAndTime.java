package ch08_text_and_core_utilities.examples;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class MoreDatesAndTime {
  public static void main(String[] args) {
    LocalDateTime first = LocalDateTime.now();

    LocalDateTime second = LocalDateTime.now();

    System.out.println(first);
    System.out.println(second);

    System.out.println(ChronoUnit.MICROS.between(first, second));

    System.out.println("---");
    System.out.println("Time zones");
    System.out.println("---");

    LocalDateTime piLocal = LocalDateTime.now();
    ZonedDateTime piCentral = piLocal.atZone(ZoneId.of("America/Chicago"));
    ZonedDateTime piAlaMode = piCentral.withZoneSameInstant(ZoneId.of("Europe/Paris"));
    ZonedDateTime piOther = piCentral.withZoneSameLocal(ZoneId.systemDefault());

    System.out.println(piLocal);
    System.out.println(piCentral);
    System.out.println(piAlaMode);
    System.out.println(piOther);

    System.out.println("---");
    System.out.println("Date Format");
    System.out.println("---");

    DateTimeFormatter shortUS = DateTimeFormatter.ofPattern("MM/dd/yy");
    LocalDate valentines = LocalDate.parse("02/14/23", shortUS);
    LocalDate piDay = LocalDate.parse("03/14/23", shortUS);

    // res: 2023-02-14
    System.out.println(valentines);
    // res: 2023-03-14
    System.out.println(piDay);

    LocalDate today = LocalDate.now();
    // res: 10/11/23
    System.out.println(shortUS.format(today));
    // res: 03/14/23
    System.out.println(shortUS.format(piDay));

    System.out.println("---");
    System.out.println("Timestamps");
    System.out.println("---");

    Instant time1 = Instant.now();
    Instant time2 = Instant.now();

    // res: false
    System.out.println(time1.isAfter(time2));
    // res: 2023-10-13T23:32:48.566105Z
    System.out.println(time1.plus(3, ChronoUnit.DAYS));

  }
}