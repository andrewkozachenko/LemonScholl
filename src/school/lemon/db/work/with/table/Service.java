package school.lemon.db.work.with.table;

import school.lemon.db.work.with.table.entity.User;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class Service {
    private static final String JDBC_DRIVER = "org.postgresql.Driver";
    private static final String JDBC_DATABASE_URL = "jdbc:postgresql://localhost:5432/";
    private static final String DATABASE_NAME = "lemon_school";
    private static final String JDBC_URL = JDBC_DATABASE_URL + DATABASE_NAME;
    private static final String DATABASE_USER = "postgres";
    private static final String DATABASE_PASSWORD = "postgres";

    public static boolean createUser(User user){
        int result = 15;
        try
        {
            Connection connection = getConnection();
            Statement statement = connection.createStatement();

            String sql = "INSERT INTO users (login, password) " +
                    "VALUES (" + user.getLogin() + "," +
                    user.getPassword() + ")";
            if (user.getId() != 0){
                sql = "INSERT INTO users (id, login, password) " +
                        "VALUES ("+user.getId()+ ",'" + user.getLogin() + "' , '" +
                        user.getPassword() + "')";
            }

            result = statement.executeUpdate(sql);
            statement.close();
            connection.close();
        }
        catch (SQLException se) {
            System.err.println(se.getMessage());
        }
        return result != 15;
    }

    public static User getUserById(int id){
        User user = new User();
        try
        {
            Connection connection = getConnection();
            Statement statement = connection.createStatement();
            ResultSet rs = statement.executeQuery("SELECT *  FROM users WHERE id=" + id);
            while ( rs.next() )
            {

                user.setId( rs.getInt    ("id"));
                user.setLogin(rs.getString("login"));
                user.setPassword(rs.getString("password"));
            }
            rs.close();
            statement.close();
            connection.close();
        }
        catch (SQLException se) {
            System.err.println(se.getMessage());
        }
        return user;
    }

    public static boolean updateUserById(User user){
        int result = 15;
        try
        {
            Connection connection = getConnection();
            Statement statement = connection.createStatement();
            result = statement.executeUpdate("UPDATE users " +
                    "SET login='" + user.getLogin() + "', password='" +
                    user.getPassword() + "' " +
                    "WHERE id=" + user.getId());
            statement.close();
            connection.close();
        }
        catch (SQLException se) {
            System.err.println(se.getMessage());
        }
        return result != 15;
    }

    public static boolean deleteUser(int userId){
        int result =15;
        try
        {
            Connection connection = getConnection();
            Statement statement = connection.createStatement();
            result = statement.executeUpdate("DELETE FROM users "+
                    "WHERE id=" + userId);
            statement.close();
            connection.close();
        }
        catch (SQLException se) {
            System.err.println(se.getMessage());
        }
        return result != 15;
    }

    public static User[] selectAllUsers(){
        List<User> users = new ArrayList<User>();
        try
        {
            Connection connection = getConnection();
            Statement statement = connection.createStatement();
            ResultSet rs = statement.executeQuery("SELECT *  FROM users ORDER BY id");
            while ( rs.next() )
            {
                User user = new User();
                user.setId( rs.getInt    ("id"));
                user.setLogin(rs.getString("login"));
                user.setPassword("password");
                users.add(user);
            }
            rs.close();
            statement.close();
           connection.close();
        }
        catch (SQLException se) {
            System.err.println(se.getMessage());
        }
        User [] usersArray = new User[users.size()];
      users.toArray(usersArray);
        return usersArray;
    }


    private static Connection getConnection()
    {
        Connection conn = null;
        try
        {
            Class.forName(JDBC_DRIVER);
            conn = DriverManager.getConnection(JDBC_URL,DATABASE_USER, DATABASE_PASSWORD);
        }
        catch (ClassNotFoundException e)
        {
            e.printStackTrace();
            System.exit(1);
        }
        catch (SQLException e)
        {
            e.printStackTrace();
            System.exit(2);
        }
        return conn;
    }
}
