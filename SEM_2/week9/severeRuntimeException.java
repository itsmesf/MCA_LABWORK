package week9;

import java.util.Scanner;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class severeRuntimeException {
    private static final Logger logger = LoggerFactory.getLogger( severeRuntimeException.class);

    public static void getInput(Scanner sc) {
        System.out.print("Enter a String: " );
        String str = sc.nextLine ();

        if(str.isEmpty ()){
            str = null;
        }

        try{
            logger.info("User entered: {}", str);
            System.out.println ("String in LowerCase: " +str.length () );

        }catch (Exception e){
            logger.error ( "Null Pointer exception Occurred",e );
            System.exit ( 1 );
        }
        finally {
            sc.close ();
        }
    }
    public static void main(String[] args) {

        LoggingFramework.setConfigFile ();

        Scanner sc = new Scanner ( System.in );
        getInput ( sc );

    }
}

