package week9;

import org.slf4j.LoggerFactory;
import org.slf4j.Logger;
import java.util.InputMismatchException;
import java.util.Scanner;

public class ArithmeticExceptionHandler {
    private static final Logger logger = LoggerFactory.getLogger ( ArithmeticExceptionHandler.class );
    static void arithmeticException(Scanner sc){
        System.out.print ("Enter two numbers: " );
        try{
            int a = sc.nextInt ( );
            int b = sc.nextInt ( );
             try{
                 logger.info ( "Entered values are: {} , {} " , a, b );
                 int result = a / b;
                 logger.info ("Division Result: " + result);
             }catch (ArithmeticException e){
                 logger.error ( "Exception Caught {}", e.getMessage ()  );
             }
        }catch (InputMismatchException e){
            logger.error ( "Input must be Integer value" , e );
            sc.next(); //Clears invalid Input
        }
        finally {
            sc.close ();
        }

    }
    public static void main ( String[] args ) {
        LoggingFramework.setConfigFile ();
        Scanner sc = new Scanner ( System.in );
        arithmeticException ( sc );

    }
}
