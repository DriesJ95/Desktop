package exercise04;

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

   @Test
   public void testSearchBeerScrollable(TestReporter reporter)
         throws SQLException {
      String sql = "SELECT b.Name, b.Alcohol, b.Price, c.Category, br.Name "
            + "FROM Beers as b, Brewers as br, Categories as c "
            + "WHERE b.BrewerId=br.Id AND b.CategoryId=c.Id ORDER BY b.Alcohol";

      try (Statement stmt = con.createStatement(
            ResultSet.TYPE_SCROLL_INSENSITIVE,
            ResultSet.CONCUR_READ_ONLY);
            ResultSet rs = stmt.executeQuery(sql)) {
         Assertions.assertNotNull(rs);
         Assertions.assertEquals(
               ResultSet.TYPE_SCROLL_INSENSITIVE, rs.getType());
         rs.afterLast();
         while (rs.previous()) {
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

   @Test
   public void testChangeStock()
         throws SQLException {
      String updateSql = "UPDATE Beers SET Stock=50 WHERE Name like '%kriek%'";
      try (Statement stmt = con.createStatement()) {
         int result = stmt.executeUpdate(updateSql);
         Assertions.assertTrue(result > 0);
      }

      String querySql = "SELECT Stock FROM Beers WHERE Name like '%kriek%'";
      try (Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery(querySql)) {
         while (rs.next()) {
            Assertions.assertEquals(50, rs.getInt(1));
         }
      }
   }

   @AfterAll
   public static void afterAll() throws SQLException {
      con.close();
   }
}