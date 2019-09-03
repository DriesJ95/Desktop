package opdracht_MyDeckUML;
import java.util.Random;

public class CardDealer {
    private Deck deck;

    public CardDealer(){
        this.deck = new Deck();
    }

    public void shuffleDeck(){
        Random rand = new Random();
        Card [] tempDeck = deck.getDeck();
        Card sCard;
        for (int i = 0; i < 52; i++){
            int swap = rand.nextInt(53);
            sCard = tempDeck[i];
            tempDeck[i] = tempDeck[swap];
            tempDeck[swap] = sCard;
        }
        deck.setDeck(tempDeck);
    }

    public void shuffleDeck(int times){
        do{
            shuffleDeck();
            times--;
        }while(times >= 0);
    }

    public Card[] dealCard(int amount){
       Card [] dealtCards = new Card[amount];
       Random rand = new Random();
       for (int i = 0; i < amount; i++){
           int rCard = rand.nextInt(deck.getDeck().length);
           dealtCards[i]= deck.getDeck()[rCard];
           deck.removeCard(dealtCards[i]);
       }
       return dealtCards;
    }

    public void addDealerCard(Card card){
        deck.addCard(card);
    }
}
