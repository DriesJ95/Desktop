package opdracht3_weekdagenEnMaanden;
import java.util.Scanner;
import java.time.*;

public class WeekMaand {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        boolean valid = false;
        String output = "De ingegeven dag was ";
        DayOfWeek original = DayOfWeek.FRIDAY;
        while (!valid){
            System.out.println("Geef een dag v/d week in (1 - 7): ");
            int choice = input.nextInt()-1;
            if (choice > 0 && choice < 8){
                valid = true;
            }
            for (DayOfWeek d : DayOfWeek.values()){
                if (d.ordinal() == choice){
                    output = output.concat(d.name() + " ");
                    original = d;
                }
            }
            System.out.println("Geef het aantal dagen in dat je er bij wilt optellen: ");
            choice = input.nextInt();
            DayOfWeek end = original.plus(choice);
            output = output.concat("de uiteindelijke dag is: " + end);
            System.out.println(output);
        }
    }
}
