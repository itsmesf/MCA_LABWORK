package week10;

import org.slf4j.LoggerFactory;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import org.slf4j.Logger;
import week9.LoggingFramework;

class databaseException extends Exception{
    public databaseException(String message, Throwable cause){
        super(message,cause);
    }
}

public class w10q2 {
    private final static Logger log = LoggerFactory.getLogger ( w10q2.class);
    private static String url = "jdbc:mysql://localhost:3306/sakila";
    private static String username = "root";
    private static String password = "";

    private static void getConnection() throws databaseException{
        try(Connection conn = DriverManager.getConnection ( url, username, password )){
            log.info ("Connection established successfully" );
        }catch (SQLException e){
            log.info ("Error establishing connection" );
            throw new databaseException (" Database connection failed: " , e.getCause ());
        }
        finally {
            log.info ("Connection closed successfully" );
        }
    }
    public static void main ( String[] args ) {
        LoggingFramework.setConfigFile();
         try{
             getConnection ();
         }catch (databaseException e){
             log.error ( "Error occurred {}" , e.getMessage () );
         }
    }
}
