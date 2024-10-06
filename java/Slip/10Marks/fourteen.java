//Q1. Write a program to create JDBC connection. On successful connection with database display
//appropriate message to user. 
//:-
//
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
//JDBC connect
public class fourteen {
    public static void main(String[] args) {
        String jdbcURL = "jdbc:mysql://localhost:3306/your_database";
        String username = "your_username";
        String password = "your_password";

        try {
            // Load the JDBC driver
            Class.forName("com.mysql.cj.jdbc.Driver");

            // Establish the connection
            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/your_database","your_username","your_password");

            if (connection != null) {
                System.out.println("Connected to the database successfully!");
                // You can perform database operations here
                // Don't forget to close the connection when you're done
                connection.close();
            } else {
                System.out.println("Failed to connect to the database.");
            }
        } catch (ClassNotFoundException e) {
            System.out.println("JDBC driver not found");
            e.printStackTrace();
        } catch (SQLException e) {
            System.out.println("Connection to the database failed");
            e.printStackTrace();
        }
    }
}
