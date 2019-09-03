import java.sql.*;

public class PreparedStatementSelectAndUpdate {
    public static void main(String[] args) {
        try (Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/beers_db", "root", "");
             PreparedStatement preparedStatement = con.prepareStatement("UPDATE beers SET Price = ? where Name = ?")) {
            preparedStatement.setDouble(1, 5.20);
            preparedStatement.setString(2, "Zulte");
            preparedStatement.executeUpdate();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }
}
