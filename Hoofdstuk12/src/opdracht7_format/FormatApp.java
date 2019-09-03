package opdracht7_format;
import java.time.*;
import java.time.format.*;
import java.util.Scanner;

public class FormatApp {
    public static void main(String[] args) {
        DateTimeFormatter isoFormatter = DateTimeFormatter.ISO_LOCAL_DATE_TIME;
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/YYYY HH:mm:ss");
        LocalDateTime here = LocalDateTime.now();
        System.out.println(formatter.format(here));
        System.out.println(isoFormatter.format(here));

        System.out.println("Geef een datum in : DD/MM/YYYY  ");
        Scanner input = new Scanner(System.in);
        String userInput = input.nextLine();
        DateTimeFormatter formatter1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate userDate = LocalDate.parse(userInput,formatter1);
        System.out.println(userDate);
        System.out.format("%1$tY-%1$tm-%1$td", userDate);
    }
}
