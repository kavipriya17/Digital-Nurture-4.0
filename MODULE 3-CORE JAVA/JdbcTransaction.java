import java.sql.*;

public class JdbcTransaction {
    public static void main(String[] args) {
        try (Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/testdb", "root", "")) {
            conn.setAutoCommit(false);

            Statement stmt = conn.createStatement();
            stmt.executeUpdate("UPDATE accounts SET balance = balance - 100 WHERE id = 1");
            stmt.executeUpdate("UPDATE accounts SET balance = balance + 100 WHERE id = 2");

            conn.commit();
            System.out.println("Transaction Successful");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
