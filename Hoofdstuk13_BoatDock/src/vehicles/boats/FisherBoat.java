package vehicles.boats;
import people.DeckHand;

public class FisherBoat extends Boat {
    public int netSize;
    public DeckHand deckHand;

    public FisherBoat(String name,double weight, double topSpeed, int netSize){
        super(name,weight,topSpeed);
        this.setNetSize(netSize);
    }

    public FisherBoat(){
        this("",0,0,0);
    }

    public DeckHand getDeckHand() {
        return deckHand;
    }

    public void setDeckHand(DeckHand deckHand) {
        this.deckHand = deckHand;
    }

    public int getNetSize() {
        return netSize;
    }

    public void setNetSize(int netSize) {
        this.netSize = netSize;
    }

    public void accelerate(){
        System.out.println("The " + getName() + " makes a loud rumbling noise as it speeds up slowly");
    }

    public String toString(){
        return super.toString() + "\nSpecific attribute: " + this.getNetSize() + "M²";
    }
}
