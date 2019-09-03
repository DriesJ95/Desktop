package immoDB;

import java.text.DecimalFormat;

public class House implements Comparable<House>{
    private double surfaceArea;
    private int numberOfRooms;
    private HouseType type;
    private double price;
    private static int count = 0;
    private int ID;

    public House(double surfaceArea, int numberOfRooms, HouseType type, double price) {
        this.surfaceArea = surfaceArea;
        this.numberOfRooms = numberOfRooms;
        this.type = type;
        this.price = price;
        this.ID = ++count;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getSurfaceArea() {
        return surfaceArea;
    }

    public void setSurfaceArea(double surfaceArea) {
        this.surfaceArea = surfaceArea;
    }

    public int getNumberOfRooms() {
        return numberOfRooms;
    }

    public void setNumberOfRooms(int numberOfRooms) {
        this.numberOfRooms = numberOfRooms;
    }

    public HouseType getType() {
        return type;
    }

    public void setType(HouseType type) {
        this.type = type;
    }

    @Override
    public String toString() {
        DecimalFormat formatto = new DecimalFormat("###,###,###,###.00");
        return "{" + ID + " | " + type +
                " | m²=" + formatto.format(surfaceArea) +
                " | rooms=" + numberOfRooms +
                " | price=" + formatto.format(price) +
                '}';
    }

    public int getID(){
        return ID;
    }

    @Override
    public int compareTo(House o) {
        return this.getID() - o.getID();
    }
}
