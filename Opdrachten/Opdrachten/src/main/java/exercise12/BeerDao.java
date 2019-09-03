package exercise12;

import java.util.List;

public interface BeerDao {

   public Beer getBeerById(int id) throws BeerException;

   public List<Beer> getBeersByAlcohol(float alcohol)
         throws BeerException;

   public List<Beer> getBeersByName(String name)
         throws BeerException;

   public void updateBeer(Beer beer) throws BeerException;

}