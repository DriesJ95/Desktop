package main;

import java.time.Instant;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Agenda_Test {
    public static void main(String[] args) {

        LocalDate now = LocalDate.now();
        LocalDate vacation = LocalDate.of(2019,04,20);
        LocalDate summer = LocalDate.of(2019,06,21);

        long daysSinceStart = ChronoUnit.DAYS.between(LocalDate.of(2019,01,28),now);
        long daysTillVacation = ChronoUnit.DAYS.between(now,vacation);

        System.out.println("There have passed " + daysSinceStart + " days since the start of the course.");
        System.out.println("There are " + daysTillVacation + " days left till the first vacation.");
        System.out.println("The 21st, a.k.a the start of summer is a " + summer.getDayOfWeek().name().toLowerCase() + ".");

    }
}
