package immoDB;

import java.util.Comparator;
import java.util.Random;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ImmoApp {
    public static void main(String[] args) {
        Immo IB_sales = new Immo();

        Scanner input = new Scanner(System.in);
        Random rand = new Random();

        System.out.println("Howmany houses would you like to randomly generate?");
        int userChoice = input.nextInt();


        //fill up the list, randomly
        for (int i = 0; i < userChoice; i++){
            IB_sales.addToSaleList(new House(rand.nextDouble()*250,rand.nextInt(8)+1,HouseType.values()[rand.nextInt(4)],rand.nextDouble()*1_000_000));
        }

        IB_sales.printHouses();

        IB_sales.printAppartments();

        IB_sales.printByValues(4,500_000);

        System.out.println(" THE 3 CHEAPEST HOUSES ARE: ");
        System.out.println("---------------------------");
        IB_sales.getHFS().stream().sorted(Comparator.comparing(House::getPrice)).limit(3).forEach(System.out::println);


        System.out.println("-------------------------------------------------");
        System.out.println("The total value is: " + IB_sales.totalPortfolioWorth() + " euros");
        System.out.println("-------------------------------------------------");

        IB_sales.filter(HouseType.CASTLE,2,1000000,100);

    }
}
