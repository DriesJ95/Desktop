package exercise06;

import java.sql.*;

public class SearchBeer {
   public static void main(String[] args) throws SQLException, ClassNotFoundException {
      String sql = "SELECT * FROM Beers WHERE Alcohol=?";
      try (Connection con = DriverManager.getConnection("jdbc:mariadb://noelvaes.eu/StudentDB", "student", "student123");
            PreparedStatement stmt = con.prepareStatement(sql)) {
         for (int i = 5; i <= 10; i++) {
            stmt.setFloat(1, i);
            try (ResultSet rs = stmt.executeQuery()) {
               while (rs.next()) {
                  String beerName = rs.getString("Name");
                  double alcohol = rs.getDouble("Alcohol");
                  double price = rs.getDouble("Price");
                  System.out.printf("%-40s %.1f %.1f %n",beerName,alcohol,price);
               }
            }
         }
      }
   }
}