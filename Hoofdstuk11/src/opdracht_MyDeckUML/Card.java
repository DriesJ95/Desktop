package opdracht_MyDeckUML;


public class Card {
    private SuitType suit;
    private Value number;

    public Card(SuitType suit,Value number){
        setSuit(suit);
        setValue(number);
    }

    public SuitType getSuit() {
        return suit;
    }

    public void setSuit(SuitType suit) {
        this.suit = suit;
    }

    public Value getValue() {
        return number;
    }

    public void setValue(Value number) {
        this.number = number;
    }

    public String toString(){
        return this.getSuit() + " " + this.getValue();
    }
}
