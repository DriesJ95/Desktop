package opdracht6_randomEx;
import java.time.*;
import java.time.temporal.ChronoUnit;

public class TimeSince {
    public static void main(String[] args) {
        LocalDate geboorte = LocalDate.of(2015,11,20);
        LocalDate now = LocalDate.now();
        Period period = Period.between(now, geboorte);
        long days = ChronoUnit.DAYS.between(now, geboorte);
        System.out.println("Aantal dagen sinds ?: " + days);
        long months = ChronoUnit.MONTHS.between(now, geboorte);
        System.out.println("Aantal maanden sinds ?: " + months);
        long years = ChronoUnit.YEARS.between(now, geboorte);
        System.out.println("Aantal jaren sinds ?: " + years);
        System.out.println(period);

    }
}
