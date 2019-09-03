package opdracht4_lokaleDataTijden;

import java.time.LocalDate;

public class LocalDateTimeApp {
    public static void main(String[] args) {
        LocalDate geboorte = LocalDate.of(1995,6,7);
        System.out.println("I was born on the " + geboorte.getDayOfYear() + "th day of the year");
        System.out.println("This was the " + geboorte.getDayOfMonth() + "th day of the month");
        System.out.println("On a " + geboorte.getDayOfWeek().name().toLowerCase());
        System.out.println("Is this a leap year? " + geboorte.isLeapYear());
    }
}
