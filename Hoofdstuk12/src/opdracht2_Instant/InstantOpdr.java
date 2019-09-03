package opdracht2_Instant;

import java.time.*;
public class InstantOpdr {
    public static void main(String[] args) {
        java.time.Instant now = java.time.Instant.now();
        System.out.println(now);
        now = now.plusSeconds(7);
        now = now.plusMillis(5);
        now = now.plusNanos(3);

        System.out.println(now);
    }
}
