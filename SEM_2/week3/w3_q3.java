
import java.util.Scanner;
public class w3_q3 {
    public static void main ( String[] args ) {
        Scanner input = new Scanner ( System.in );

        int i = 0;
        double num, sum = 0, mul = 1;

        while ( i < 4 ) {
            i++;
            System.out.print ( "Enter number: " );
            num = input.nextDouble ( );
            sum += num;
            mul *= num;
        }

        System.out.println ( "\nSum of entered numbers: " + sum );
        System.out.println ( "\nMultiplication of entered number: " + Math.round ( mul * 100.0 ) / 100.0 );
    }
}

