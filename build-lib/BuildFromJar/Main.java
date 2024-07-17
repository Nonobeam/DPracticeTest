package BuildFromJar;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

import dao.DbBuilder;

public class Main {
    public static void main(String[] args) {
        DbBuilder dbBuilder = new DbBuilder();
        Connection connection = dbBuilder.getConnection();
        String query = "SELECT * FROM User";
        dbBuilder.query(connection, query);
    }
}
