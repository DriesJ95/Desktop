package exercise12;

import java.util.List;

public class BeerClient {

   public static void main(String[] args) throws BeerException {
      BeerDao beerDao = new BeerDaoImpl(
            "jdbc:mariadb://noelvaes.eu/StudentDB", "student",
            "student123");
            
      Beer beer = beerDao.getBeerById(100);
      
      System.out.println(beer.getName());
      System.out.println(beer.getPrice());
      System.out.println(beer.getAlcohol());
      System.out.println(beer.getStock());
      
      beer.setStock(beer.getStock() -10);
      beerDao.updateBeer(beer);
      
      List<Beer> beers = beerDao.getBeersByAlcohol(10);
      beers.forEach(System.out::println);

      beers = beerDao.getBeersByName("kriek");
      beers.forEach(System.out::println);
   }
}
