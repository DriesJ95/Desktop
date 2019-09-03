package opdracht_MyDeckUML;

public enum ChipColorValue {
    RED(5),GREEN(10),BLACK(25),GOLD(50);

    private int worth;

    ChipColorValue(int worth){
        this.worth = worth;
    }
}
