package immoDB;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.PriorityQueue;
import java.util.Queue;

public class Immo {
    private Queue<House> hfs;

    public Immo(){
        hfs = new PriorityQueue<>();
    }

    public Queue<House> getHFS(){
        return hfs;
    }

    public void setHFS(Queue<House> hfs){
        this.hfs = hfs;
    }

    public void filter(HouseType ht, int rooms, double price, double surfaceArea){
        System.out.println("Filtering on " + ht.name().toUpperCase() + " | rooms >= " + rooms + " | price <= " + price + " | m² >= " + surfaceArea);
        System.out.println("--------------------------------------------------------------------------");
        hfs.stream()
                .filter(house -> house.getType() == ht)
                .filter(house -> house.getNumberOfRooms() >= rooms)
                .filter(house -> house.getPrice() <= price)
                .filter(house -> house.getSurfaceArea() >= surfaceArea)
                .sorted()
                .forEach(System.out::println);
    }

    public void addToSaleList(House h){
        hfs.offer(h);
        System.out.println(h + " has been added to the sales list");
    }

    public String totalPortfolioWorth(){
        double total = 0;

        for (House h : hfs){
            total += h.getPrice();
        }
        DecimalFormat formatto = new DecimalFormat("###,###,###,###.00");
        return formatto.format(total);
    }

    public void printHouses(){
        System.out.println("-------------------------------------------------------");
        System.out.println(" PRINTING ALL HOUSES:");
        System.out.println("----------------------");
        for (House h : hfs){
            if (h.getType() == HouseType.ROW_HOUSE || h.getType() == HouseType.VILLA){
                System.out.println(h.toString());
            }
        }
        System.out.println("-------------------------------------------------------");
    }

    public void printAppartments(){
        System.out.println(" PRINTING ALL APPARTMENTS:");
        System.out.println("---------------------------");
        for (House h : hfs){
            if (h.getType() == HouseType.APPARTMENT){
                System.out.println(h.toString());
            }
        }
        System.out.println("-------------------------------------------------------");
    }

    public void printCastles(){
        System.out.println("-----------------------");
        System.out.println(" PRINTING ALL CASTLES:");
        System.out.println("-----------------------");
        for (House h : hfs){
            if (h.getType() == HouseType.CASTLE){
                System.out.println(h.toString());
            }
        }
        System.out.println("-------------------------------------------------------");
    }

    public void printByValues(int minRooms, double priceLimit){
        System.out.println(" HOUSES WITH " + minRooms + "+ ROOMS AND COSTING LESS THAN " + priceLimit);
        System.out.println("-------------------------------------------------------");
        for (House h: hfs){
            if (h.getNumberOfRooms() >= minRooms && h.getPrice() <= priceLimit){
                System.out.println(h.toString());
            }
        }
        System.out.println("-------------------------------------------------------");
    }
}
