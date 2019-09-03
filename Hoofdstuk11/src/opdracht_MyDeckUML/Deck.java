package opdracht_MyDeckUML;

public class Deck {
    private Card[] cards = new Card[]{};

    public Deck(){
        makeDeck();
    }

    public Deck(Card[] cards){
        this.cards = cards;
    }

    private void makeDeck(){
        SuitType[] s = SuitType.values();
        Value[] v = Value.values();
        for (int j = 0; j < 4; j++) {
            for (int i = 0; i < 13; i++) {
                addCard(new Card(s[j], v[i]));
            }
        }
    }

    public Card[] getDeck(){
        return cards;
    }

    public void setDeck(Card[] cards){
        this.cards = cards;
    }

    public void addCard(Card card){
        Card[] temp = new Card[cards.length+1];
        for (int i = 0; i < cards.length; i++){
            temp[i] = cards[i];
        }
        temp[cards.length]=card;
        cards = temp;

    }

    public void removeCard(Card card){
        Card [] temp = new Card [cards.length-1];
        boolean flag = false;
        for(int i = 0; i < cards.length-1; i++) {
            if (cards[i].equals(card)) {
                temp[i] = cards[i+1];
                flag = true;
            } else if (flag){
                temp[i]=cards[i+1];
            } else{
                temp[i] = cards[i];
            }
        }
        cards = temp;
    }
}
