package week11;

import java.io.Closeable;
import java.io.IOException;
import java.text.ParseException;
import java.util.Date;
import java.text.SimpleDateFormat;

class customDateException extends Exception{
    customDateException(String message){
        super(message);
    }
}

class CloseableDateFormat extends SimpleDateFormat implements Closeable{
    public CloseableDateFormat(String pattern){
          super(pattern);
          this.setLenient ( false );
    }

    public void close() throws IOException{
        System.out.println ("DateFormat resource closed" );
    }
}

public class w11_q2{

    public static void parseDate(String dateStr) throws customDateException{
        try(CloseableDateFormat formatter = new CloseableDateFormat ( "yyyy MM dd" )){
            Date date = formatter.parse ( dateStr );
            System.out.println("Parsed date successfully: " + formatter.format(date));
        }catch (ParseException e){
            throw new customDateException ( e.getMessage () );
        }catch (IOException e){
            System.out.println ("IOException Occurred " + e.getMessage () );
        } finally {
            System.out.println("Finished parsing attempt for date: " + dateStr);
        }
    }
    public static void main ( String[] args ) {
        try {
            parseDate("2025 02 29");
        } catch (customDateException e) {
            System.err.println("Custom Exception Caught: " + e.getMessage());
        }

    }
}