package opdracht11;

import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.Map;

public class LinkedHashMapApp {
    public static void main(String[] args) {
        Map<Coin, Integer> portemonnee = new LinkedHashMap<>();

        portemonnee.put(Coin.ONE_CENT, 7);
        portemonnee.put(Coin.TWO_CENT, 4);
        portemonnee.put(Coin.FIVE_CENT, 10);
        portemonnee.put(Coin.TEN_CENT, 4);
        portemonnee.put(Coin.TWENTY_CENT, 8);
        portemonnee.put(Coin.FIFTY_CENT, 3);
        portemonnee.put(Coin.ONE_EURO, 3);
        portemonnee.put(Coin.TWO_EURO, 4);

        System.out.println(portemonnee.toString());

        int totalworth = 0;
        for (Coin c : portemonnee.keySet()) {
            totalworth += (portemonnee.get(c) * c.getValue());
        }
        System.out.println("------------------------------------------");
        System.out.println("Total worth is " + totalworth + " cents");
        System.out.println("------------------------------------------");

        portemonnee.entrySet()
                .stream()
                .sorted(Comparator.comparing(Map.Entry::getKey))
                .forEach(System.out::println);


    }
}
