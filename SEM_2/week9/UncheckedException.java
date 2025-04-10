package week9;

import java.util.Scanner;

public class UncheckedException {
    static void Exception(Scanner sc){
        int n = 5;
        int[] arr = new int[n];
        System.out.println ("Insert Array Elements: " );
        try{
            int i  = 0;
            while(true){
                String UserInput = sc.nextLine ();
                try{
                    arr[i++] = Integer.parseInt ( UserInput );
                }catch (NumberFormatException e){
                    System.err.println ("Error Occurred: " + e.getMessage ());
                }
            }
        }catch (ArrayIndexOutOfBoundsException e){
            System.err.println ("Error Occurred: "+e.getMessage () );
        }

        System.out.println ( "\nArray elements after division by their respective index\n" );
        for(int i = 0; i<n;i++) {
            try {
                System.out.print( arr[i] + " / " + i + " = " );
                System.out.print ((arr[i] / i) + "\n" );
            } catch (ArithmeticException e) {
                System.out.println ( "Division by Zero Exception" );
            }
        }
    }

    public static void main ( String[] args ) {
        Scanner sc = new Scanner ( System.in );
        Exception(sc);
    }
}
