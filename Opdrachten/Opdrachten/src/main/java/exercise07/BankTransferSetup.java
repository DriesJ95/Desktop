package exercise07;

import java.sql.*;

public class BankTransferSetup {
   private static final String UPDATE = "update Accounts set amount = ? where number = ?";

   public static void main(String[] args) throws Exception {
      try (Connection con = DriverManager.getConnection(
            "jdbc:mariadb://noelvaes.eu/StudentDB", "student",
            "student123");) {
         try (PreparedStatement ustmt = con.prepareStatement(
               UPDATE);) {
            ustmt.setDouble(1, 1000);
            ustmt.setInt(2, 1);
            ustmt.executeUpdate();
            ustmt.setDouble(1, 0);
            ustmt.setInt(2, 2);
            ustmt.executeUpdate();
         }
      }
   }
}