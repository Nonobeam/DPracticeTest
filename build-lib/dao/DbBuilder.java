package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

public class DbBuilder {
    public Connection getConnection() {
        String url = "jdbc:mysql://localhost:3306/digiex";
        String username = "root";
        String password = "123";
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection connection = DriverManager.getConnection(url, username, password);

            return connection;
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }
        
        return null;
    }

    public void query(Connection connection, String query) {
        try {
            ResultSet resultSet = connection.createStatement().executeQuery(query);    
            while (resultSet.next()) {
                System.out.println(resultSet.getString("name"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
