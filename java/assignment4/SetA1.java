import java.sql.*;

public class PersonDetails {
    public static void main(String[] args) {
        String url = "jdbc:postgresql://localhost:5432/yourDatabase";
        String user = "yourUsername";
        String password = "yourPassword";

        try (Connection conn = DriverManager.getConnection(url, user, password);
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery("SELECT * FROM Person")) {

            System.out.printf("%-5s %-10s %-6s %-10s\n", "PID", "Name", "Gender", "Birth Year");
            System.out.println("-------------------------------------");

            while (rs.next()) {
                int pid = rs.getInt("PID");
                String name = rs.getString("name");
                String gender = rs.getString("gender");
                int birthYear = rs.getInt("birth_year");

                System.out.printf("%-5d %-10s %-6s %-10d\n", pid, name, gender, birthYear);
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}

