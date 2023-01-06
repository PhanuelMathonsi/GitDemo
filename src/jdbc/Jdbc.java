package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Jdbc {
    public static void main(String[] args) throws SQLException {
    

        Connection conn = null;

        // jdbc for java database connectivity:sqlite for type of database type
        // then the path to the database
        String url = "jdbc:sqlite:C:/SQLlite/db/chinook.db";

        conn = DriverManager.getConnection(url);

        System.out.println("Connection to SQLlite databse has been established");

        String sql = "SELECT Title, ArtistId FROM albums";

        Statement stmt = conn.createStatement();

        ResultSet rs = stmt.executeQuery(sql);

        //loop throught the results set
        while(rs.next()){
            System.out.println(rs.getString("Title"));

        }
        rs.close();

    }
}
