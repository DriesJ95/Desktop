package tijdsmeting;

import java.util.Scanner;

public class TijdsMetingApp {

    //Method for calculating hours correctly.
    public static int calculateHours(int startHour, double startMinute, int stopHour, double stopMinute) {
        double totalMinutes = (60 - startMinute) + stopMinute;
        int totalHours = 0;
        if (totalMinutes >= 60) {
            totalHours++;
        }

        //For nightwork
        if (stopHour < startHour) {
            int hoursDay1 = 24 - startHour;
            totalHours = hoursDay1 + stopHour;
            if (stopMinute < startMinute) {
                totalHours--;
            }
        } else {
            totalHours = (stopHour - startHour);
            if (stopMinute < startMinute){
                totalHours--;
            }
        }
        return totalHours;
    }
    //Method for calculating minutes correctly.
    public static double calculateMinutes(double startMinute, double stopMinute) {
        double totalMinutes = (60 - startMinute) + stopMinute;
        if (totalMinutes >= 60) {
            totalMinutes -= 60;
        }
        return totalMinutes;
    }
    //Method for calculating wages correctly.
    public static double calculateWages(int startDay, int startHour, double startMinute, int stopDay, int stopHour, double stopMinute, double calculatedMinutes, int calculatedHours){
        final double wage = 11.50;
        final double satWage = 11.50 * 1.25;
        final double sunWage = 11.50 * 1.50;

        double wageEarned = 0;

        if (startDay != 6 && stopDay != 6 && startDay != 7 && stopDay != 7){
            wageEarned = ((calculatedMinutes * wage)/60)+(calculatedHours * wage);
        }
        if (startDay == stopDay && startDay == 6){
            wageEarned = ((calculatedMinutes * satWage)/60)+(calculatedHours * satWage);
        } else if (startDay == stopDay && startDay == 7){
            wageEarned = ((calculatedMinutes * sunWage)/60)+(calculatedHours * sunWage);
        } else if (stopDay == 6 && startDay != 6){
            wageEarned = ((stopHour * satWage) + (stopMinute * satWage/60));
            wageEarned = wageEarned + ((24 - startHour - 1) * wage) + ((60 - startMinute) * wage/60);
        } else if (stopDay == 7 && startDay == 6){
            wageEarned = ((stopHour * sunWage) + (stopMinute * sunWage/60));
            wageEarned = wageEarned + ((24 - startHour - 1) * satWage) + ((60 - startMinute) * satWage/60);
        } else if (startDay == 7 && stopDay != 7){
            wageEarned = ((24 - startHour - 1) * sunWage) + ((60 - startMinute) * sunWage/60);
            wageEarned = wageEarned + ((stopHour * wage) + (stopMinute * wage/60));
        }
        return wageEarned;
    }
    //Main method
    public static void main(String[] args) {

        /*Initialising scanner and requesting input for necessary data*/
        Scanner input = new Scanner(System.in);
        boolean flag = false;
        int startDay = 0;
        int startHour = 0;
        double startMinute = 0;
        int stopDay = 0;
        int stopHour = 0;
        double stopMinute = 0;

        //Cycles input 'till it's all correct
        while (!flag) {
            /*Input startday-hour-minute*/
            System.out.println("Geef je start dag in (1-7)");
            startDay = input.nextInt();
            System.out.println("Geef je start uur in (1-24)");
            startHour = input.nextInt();
            System.out.println("Geef je start minuten in (0-60)");
            startMinute = input.nextDouble();

            /*Input stopday-hour-minute*/
            System.out.println("Geef je stop dag in (1-7)");
            stopDay = input.nextInt();
            System.out.println("Geef je stop uur in (1-24)");
            stopHour = input.nextInt();
            System.out.println("Geef je stop minuten in (0-60)");
            stopMinute = input.nextDouble();
            if (startDay > 0 && startDay < 8 && startHour > 0 && startHour < 25 && startMinute >= 0 && startMinute <= 60 && stopDay > 0 && stopDay < 8 && stopHour > 0 && stopHour < 25 && stopMinute >= 0 && stopMinute <= 60){
                flag = true;
            }else{
                System.out.println("You entered incorrect value(s), try again.");
            }
        }


        int calculatedHours = TijdsMetingApp.calculateHours(startHour, startMinute, stopHour, stopMinute);
        double calculatedMinutes = TijdsMetingApp.calculateMinutes(startMinute, stopMinute);
        double calculatedWages = TijdsMetingApp.calculateWages(startDay, startHour, startMinute, stopDay, stopHour, stopMinute, calculatedMinutes, calculatedHours);

        System.out.println("This person worked " + calculatedHours + "h " + calculatedMinutes + "m and earned " + calculatedWages + " euros.");
        input.close();
    }

}


