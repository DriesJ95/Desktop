package opdracht1_coins;
import java.util.Random;
import java.util.Arrays;

public class CoinApp {
    public static void main(String[] args) {
        Random rand = new Random();
        Coin [] coins = new Coin [rand.nextInt(10)+1];
        for (int i = 0; i < coins.length; i++){
            int randCoin = rand.nextInt(8);
            switch (randCoin){
                case 0: coins[i] = Coin.ONE_CENT; break;
                case 1: coins[i] = Coin.TWO_CENT; break;
                case 2: coins[i] = Coin.FIVE_CENT; break;
                case 3: coins[i] = Coin.TEN_CENT; break;
                case 4: coins[i] = Coin.TWENTY_CENT; break;
                case 5: coins[i] = Coin.FIFTY_CENT; break;
                case 6: coins[i] = Coin.ONE_EURO; break;
                case 7: coins[i] = Coin.TWO_EURO; break;
            }
        }
        System.out.println("The total value is: " + calcValue(coins) + " cents");
        System.out.println(Arrays.toString(coins));

    }
    public static int calcValue(Coin [] coins){
        int totalValue = 0;
        for (Coin c : coins){
            totalValue += c.getValue();
        }
        return totalValue;
    }
}
