package opdracht5_Tijdzones;
import java.time.*;

public class TimeZoneEx {
    public static void main(String[] args) {

        ZoneId london = ZoneId.of("Europe/London");
        ZoneId sydney = ZoneId.of("Australia/Sydney");
        ZoneId adelaide = ZoneId.of("Australia/Adelaide");

        ZonedDateTime nowBelgium = ZonedDateTime.now();
        ZonedDateTime nowLondon = ZonedDateTime.now(london);
        ZonedDateTime nowSydney = ZonedDateTime.now(sydney);
        ZonedDateTime nowAdelaide = ZonedDateTime.now(adelaide);
        ZonedDateTime nowUTC4 = ZonedDateTime.now(ZoneOffset.ofHours(-4));

        System.out.println("Belgium: " + nowBelgium.toLocalTime());
        System.out.println("London: " + nowLondon.toLocalTime());
        System.out.println("Sydney: " + nowSydney.toLocalTime());
        System.out.println("Adelaide: " + nowAdelaide.toLocalTime());
        System.out.println("UTC-4: " + nowUTC4.toLocalTime());
    }
}
