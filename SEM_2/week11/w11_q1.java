package week11;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import week9.LoggingFramework;

import java.text.DateFormat;
import java.text.ParseException;
import java.util.Date;
import java.text.SimpleDateFormat;

public class w11_q1 {

    private static final Logger logger = LoggerFactory.getLogger ( w11_q1.class );

    public static void ParseDate(String dateStr) {
        DateFormat formatter = new SimpleDateFormat ( "yyyy MM dd" );
        formatter.setLenient ( false );
        try {
            Date date = formatter.parse(dateStr);
            System.out.println("Parsed date successfully: " + formatter.format ( date ));
        } catch (ParseException e) {
            logger.error ("{}" ,e.getMessage());
        } finally {
            System.out.println("Finished parsing attempt for date: " + dateStr);
        }
    }
    public static void main ( String[] args ) {
        LoggingFramework.setConfigFile ();
        ParseDate ( "2025 02 29" );
        ParseDate ( "2024 02 29" );
    }
}
