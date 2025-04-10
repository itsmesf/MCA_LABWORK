package week9;

import java.io.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ExceptionUsingLogging {

    private static final Logger logger = LoggerFactory.getLogger(ExceptionUsingLogging.class);

    static void readFile(String path) {
        try (BufferedReader reader = new BufferedReader(new FileReader(new File(path)))) {
            logger.info("File Opened Successfully: {}", path);

            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }

            logger.info("File Read Successfully.");
        }
        catch (FileNotFoundException e) {
            logger.error("File not found: {}", path);
        }
        catch (IOException e) {
            logger.error("An error occurred while reading the file: {}", e.getMessage());
        }
        finally {
            logger.info("Operation completed.");
        }
    }

    public static void main(String[] args) {

        LoggingFramework.setConfigFile();

        readFile("C:\\Users\\fatim\\abc.txt");
    }
}
