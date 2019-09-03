package test;
import java.util.Scanner;

public class LoonTestApp {

    public static void main(String[] args) {
        int hours;
        int hoursSurplus;
        double brutoWageHourly;
        double netWageHourly;
        double calculatedBrutoWage;
        double calculatedNetWage;

        Scanner userInput = new Scanner(System.in);
        System.out.println("Enter worked hours: ");
        hours = userInput.nextInt();
        System.out.println("Enter surplus hours: ");
        hoursSurplus = userInput.nextInt();
        System.out.println("Enter wage (bruto): ");
        brutoWageHourly = userInput.nextDouble();

        netWageHourly = brutoWageHourly * 0.70;

        calculatedBrutoWage = (hours * brutoWageHourly) + (hoursSurplus * brutoWageHourly * 1.50);
        if (calculatedBrutoWage > 3000){
            calculatedNetWage = ((hours * brutoWageHourly) * 0.65) + ((hoursSurplus * brutoWageHourly * 1.50)*0.65);
        }else{
            calculatedNetWage = ((hours * brutoWageHourly) * 0.70) + ((hoursSurplus * brutoWageHourly * 1.50)*0.70);
        }
        System.out.println("The calculated bruto wage is " + calculatedBrutoWage + " euros");
        System.out.println("The calculated net wage is " + calculatedNetWage + " euros");
        userInput.close();


    }
}
