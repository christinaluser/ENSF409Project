package Server.Model;

import java.sql.*;


public class Database {
    private Connection connection;

    public Database() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (Exception e) {
            System.err.println("Unable to find and load driver");
        }
        try {

            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/ToolShop?serverTimezone=GMT",
                    "root", "Iig82cb3!");
        } catch (SQLException e) {
           e.printStackTrace();
        }
    }

    public ResultSet select(String queryStr) {
        ResultSet resultSet;
        try {
            PreparedStatement statement = connection.prepareStatement(queryStr);
            resultSet = statement.executeQuery(queryStr);
        } catch (SQLException e) {
            throw new IllegalStateException("Unable to execute query: " + queryStr, e);
        }
        return resultSet;
    }

    public Connection getConnection() {
        return connection;
    }
}