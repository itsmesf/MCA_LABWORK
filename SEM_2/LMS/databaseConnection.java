package LMS;

import java.sql.*;
public class databaseConnection {

    private static String url = "jdbc:oracle:thin:@localhost:1521:XE";
    private static String username = "system";
    private static String password = "system";
    public static void main ( String[] args ) {

        try{
            Connection conn = DriverManager.getConnection ( url, username, password );
            System.out.println ("Connected successfully" );
            conn.close ();

        }catch (SQLException e){
            System.out.println ("Connection failed" );
            e.printStackTrace ();
        }

    }
}
