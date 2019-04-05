package school.lemon.db;

import school.lemon.db.work.with.table.entity.User;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

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
            if (connection == null) {
                System.err.println("Failed to make connection!");
            } else {
                System.out.println("You made it, take control your database now!");
            List<User> users = new ArrayList<User>();
            try
            {

                Statement statement = connection.createStatement();
                ResultSet rs = statement.executeQuery("SELECT *  FROM public.users ");
                while ( rs.next() )
                {
                    User user = new User();
                    user.setId( rs.getInt    ("id"));
                    user.setLogin(rs.getString("login"));
                    user.setPassword(rs.getString("password"));
                    users.add(user);
                }
                rs.close();
                statement.close();

            }
            catch (SQLException se) {
                System.err.println(se.getMessage());
            }
            User [] usersArray = new User[users.size()];
            users.toArray(usersArray);
                System.out.println(users);
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
