package week13;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import org.slf4j.LoggerFactory;
import org.slf4j.Logger;
import week9.LoggingFramework;

class customFileNotFoundException extends Exception{
    public customFileNotFoundException(String message){
        super(message);
    }
}

public class FileHandler {

    private final static Logger logger = LoggerFactory.getLogger ( FileHandler.class );
    public static void main ( String[] args ) {

        LoggingFramework.setConfigFile ();

        File f = new File ( "C:\\Users\\OneDrive\\xyz.txt" );

        try(FileReader reader = new FileReader ( f )) {

            int data;
            while ( (data = reader.read ( )) != -1 ) {
                System.out.print ( (char) data );
            }
            System.out.println ();

        } catch (FileNotFoundException e) {
            try{
                throw new customFileNotFoundException (e.getMessage () );
            }catch (customFileNotFoundException ce){
                logger.error (ce.getMessage () );
            }

        } catch (IOException e) {
            logger.error ("IOException {}", e.getMessage () );
        } finally {
            logger.info ("File closed successfully" );
        }
    }
}
