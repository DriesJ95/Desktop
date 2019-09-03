import java.sql.*;

public class ConnectDB {
    public static void main(String[] args) {
        try (Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/beers_db", "root", "");
             Statement stmt = con.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
             ResultSet rs = stmt.executeQuery("SELECT * FROM beers WHERE Alcohol = 5;")) {

            while (rs.next()) {
                System.out.format("%-70s %8s %8s%n", rs.getString("Name"), rs.getDouble("Alcohol"), rs.getDouble("Price"));
            }
        } catch (
                Exception e) {
            System.out.println("Oops, something went wrong!");
            e.printStackTrace();
        }
    }
}