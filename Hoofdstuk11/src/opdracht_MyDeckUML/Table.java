package opdracht_MyDeckUML;

import java.util.Arrays;

public class Table {
    private Card[] dealerCards;
    private Card[][] playerCards = new Card[2][];
    private CardDealer dealer;
    private CasinoPlayer[] player = new CasinoPlayer[2];

    public Table() {
        this.dealer = new CardDealer();
    }

    public void startGame() {
        if (getPlayer(0) == null && getPlayer(1) == null) {
            player[0] = new CasinoPlayer(1000, new Chip[]{});
            player[1] = new CasinoPlayer(750, new Chip[]{});
        }
        setPlayerCards(dealer.dealCard(2), 0);
        setPlayerCards(dealer.dealCard(2), 1);
        setDealerCards(dealer.dealCard(2));
        checkWinners();
        System.out.println(this.toString());
        cleanTable();
    }

    public Card[] getDealerCards() {
        return dealerCards;
    }

    public void setDealerCards(Card[] dealerCards) {
        this.dealerCards = dealerCards;
    }

    public Card[] getPlayerCards(int p) {
        return playerCards[p];
    }

    public void setPlayerCards(Card[] playerCards, int p) {
        this.playerCards[p] = playerCards;
    }

    public CardDealer getDealer() {
        return dealer;
    }

    public CasinoPlayer getPlayer(int p) {
        return player[p];
    }

    public void checkWinners() {
        int P1 = 0;
        int P2 = 0;
        int Dealer = 0;
        //calculate total value of handheld cards for each participant
        for (Card c : getPlayerCards(0)) {
            P1 += c.getValue().getValue();
        }
        for (Card c : getPlayerCards(1)) {
            P2 += c.getValue().getValue();
        }
        for (Card c : getDealerCards()) {
            Dealer += c.getValue().getValue();
        }
        int hoogste = Math.max(Math.max(P1,Dealer), P2);
        //check if the participants have the same value
        if (P2 == P1 && (Dealer < P2)){
            System.out.println("Split pot between player 1 and 2");
        }else if(Dealer == P2 && (P1 < P2)){
            System.out.println("Split pot between dealer and player 2");
        }else if(Dealer == P1 && (P2 < P1)){
            System.out.println("Split pot between dealer and player 1");
        }
        //check the highest value
        if (P1 == hoogste && hoogste <= 23 && P2 < P1 || P2 > 23) {
            hoogste = Math.max(P1, Dealer);
            if (P1 == hoogste && hoogste <= 23) {
                System.out.println("Player 1 won");
            } else {
                System.out.println("Dealer won");
            }
        }
        if (P2 == hoogste && hoogste <= 23 && P1 < P2 || P1 > 23) {
            hoogste = Math.max(P2, Dealer);
            if (P2 == hoogste && hoogste <= 23) {
                System.out.println("Player 2 won");
            } else {
                System.out.println("Dealer won");
            }
        }
        if (Dealer > P1 && Dealer > P2){
            System.out.println("Dealer won");
        }

    }

    public void cleanTable() {
        for (int i = 0; i < playerCards[0].length; i++) {
            dealer.addDealerCard(playerCards[0][i]);
        }
        for (int i = 0; i < playerCards[1].length; i++) {
            dealer.addDealerCard(playerCards[1][i]);
        }
        for (int i = 0; i < dealerCards.length; i++) {
            dealer.addDealerCard(dealerCards[i]);
        }
        cleanCards(playerCards[0]);
        cleanCards(playerCards[1]);
        cleanCards(dealerCards);
    }

    public void cleanCards(Card[] cards) {
        for (int i = 0; i < cards.length; i++) {
            cards[i] = null;
        }
    }

    public String toString() {
        int P1 = 0;
        int P2 = 0;
        int Dealer = 0;
        //calculate total value of handheld cards for each participant
        for (Card c : getPlayerCards(0)) {
            P1 += c.getValue().getValue();
        }
        for (Card c : getPlayerCards(1)) {
            P2 += c.getValue().getValue();
        }
        for (Card c : getDealerCards()) {
            Dealer += c.getValue().getValue();
        }
        return "Player 1: " + Arrays.toString(playerCards[0]) + "\nPlayer 1 total value: " + P1 +
                "\n\nPlayer 2: " + Arrays.toString(playerCards[1]) + "\nPlayer 2 total value: " + P2 +
                "\n\nDealer:   " + Arrays.toString(dealerCards) + "\nDealer total value: " + Dealer;
    }
}
