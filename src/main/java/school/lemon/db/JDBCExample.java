package school.lemon.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class JDBCExample {

    public static void main(String[] args) {
        System.out.println("-------- PostgreSQL JDBC Connection Testing ------------");
        try {
            Class.forName("org.postgresql.Driver");
        } catch (ClassNotFoundException e) {
            System.out.println("Where is your PostgreSQL JDBC Driver? Include in your library path!");
            e.printStackTrace();
            return;
        }
        System.out.println("PostgreSQL JDBC Driver Registered!");
        Connection connection = null;
        try {
            connection = DriverManager.getConnection("jdbc:postgresql://127.0.0.1:5432/lemon_school", "postgres", "postgres");
//            connection = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/lemon_school?serverTimezone=UTC", "user", "lemonschool"); // for MySQL users
            if (connection != null) {
                System.err.println("You made it, take control your database now!");
            } else {
                System.out.println("Failed to make connection!");
            }
        } catch (SQLException e) {
            System.out.println("Connection Failed! Check output console");
            e.printStackTrace();
        } finally {
            try {
                if (connection != null){
                    connection.close();
                }
            } catch (SQLException e){
                System.err.println("Connection Failed! Check output console");
            }
        }


    }
}
