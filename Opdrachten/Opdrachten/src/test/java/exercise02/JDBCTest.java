package exercise02;

import java.sql.*;

import org.junit.jupiter.api.*;

public class JDBCTest {
   private static Connection con;

   @BeforeAll
   public static void beforeAll() throws SQLException {
      con = DriverManager.getConnection(
            "jdbc:mariadb://noelvaes.eu/StudentDB", "student",
            "student123");
   }

   @Test
   public void testSearchBeer(TestReporter reporter)
         throws SQLException {
      String sql = "SELECT b.Name, b.Alcohol, b.Price, c.Category, br.Name "
            + "FROM Beers as b, Brewers as br, Categories as c "
            + "WHERE b.BrewerId=br.Id AND b.CategoryId=c.Id ORDER BY b.Alcohol";

      try (Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery(sql)) {
         Assertions.assertNotNull(rs);

         while (rs.next()) {
            String beerName = rs.getString("b.Name");
            double alcohol = rs.getDouble("b.Alcohol");
            double price = rs.getDouble("b.Price");
            String brewerName = rs.getString("br.Name");
            String beerKind = rs.getString("c.Category");
            reporter.publishEntry("Beer",
                  String.format("%s %s %s %s %s%n", beerName,
                        alcohol, price, brewerName, beerKind));
         }
      }
   }

   @AfterAll
   public static void afterAll() throws SQLException {
      con.close();
   }
}