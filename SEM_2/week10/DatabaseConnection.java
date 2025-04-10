package week10;

import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.SQLException;

public class DatabaseConnection {

    private static String URL = "jdbc:mysql://localhost:3306/sakila";
    private static String Username = "root";
    private static String Password = "Sadaf9186";

    public static void main ( String[] args ) {
        try{
            Connection conn = DriverManager.getConnection(URL, Username, Password);
            System.out.println ("Connection established Successfully" );
            conn.close ();

        }catch (SQLException e){
            System.out.println (e.getMessage () );
        }
    }
}
