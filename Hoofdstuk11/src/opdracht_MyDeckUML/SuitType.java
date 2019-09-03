package opdracht_MyDeckUML;

public enum SuitType {
    CLUBS("Clubs"),
    DIAMONDS("Diamonds"),
    SPADES("Spades"),
    HEARTS("Hearts");

    private String typeName;

    SuitType(String typeName){
        this.typeName = typeName;
    }

    public String getSuitType(){
        return typeName;
    }
}
