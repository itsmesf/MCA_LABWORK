package week9;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import java.io.*;
import java.util.logging.LogManager;

public class LoggingFramework {

    private static final Logger logger = LoggerFactory.getLogger(LoggingFramework.class);

    public static void setConfigFile(){
        try {
            // Manually set the configuration file
            FileInputStream configFile = new FileInputStream("C:/Users/logs/logging.properties");
            LogManager.getLogManager().readConfiguration(configFile);
            System.out.println("Logging configuration loaded successfully.");
        }
        catch (IOException e) {
            System.err.println("Failed to load logging configuration: " + e.getMessage());
        }
    }

    static void readFile(String Path){
        try(BufferedReader reader = new BufferedReader ( new FileReader ( new File ( Path) ) )){
            String line;
            while((line = reader.readLine ( ))!=null){
                System.out.println (line );
            }
        }
        catch (IOException e){
            logger.error ( "An error occurred: {} ", e.getMessage ());
        }
    }
    public static void main(String[] args) {

        setConfigFile();
        readFile("C:\\Users\\OneDrive\\Desktop\\abc.txt" );
    }
}
