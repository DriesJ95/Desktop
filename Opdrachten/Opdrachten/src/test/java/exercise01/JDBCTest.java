package exercise01;

import java.sql.*;

import org.junit.jupiter.api.*;

public class JDBCTest {
   private static Connection con;

   @BeforeAll
   public static void init() throws SQLException {
      con = DriverManager.getConnection(
            "jdbc:mariadb://noelvaes.eu/StudentDB", "student",
            "student123");
   }

   @Test
   public void test() {

   }

   @AfterAll
   public static void close() throws SQLException {
      con.close();
   }
}