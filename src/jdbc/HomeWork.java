package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import org.sqlite.SQLiteException;

public class HomeWork {
    public static void main(String[] args) {

        try {

            String url = "jdbc:sqlite:C:/SQLlite/db/chinook.db";

            Connection conn = DriverManager.getConnection(url);

            System.out.println("Connection to SQLlite databse has been established");

            String sql = "SELECT Title, ArtistId FROM albums";

            Statement stmt = conn.createStatement();

            ResultSet rs = stmt.executeQuery(sql);

            while (rs.next()) {
                
                System.out.println(rs.getString("Title"));

            }
            
            rs.close();

        } catch (SQLiteException e) {
    
            System.out.println("The SQL statement is wrong");
            
        }catch(SQLException e){
            System.out.println("Please fix your path to the database");
            
        }finally{
            System.out.println("Done!");
        }
    }
}
