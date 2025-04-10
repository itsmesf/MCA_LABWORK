package LMS;

import java.util.Scanner;

class multipleException extends Exception {
    multipleException ( String message ) {
        super ( message );
    }
}
    public class countUsingTryCatch {
        public static void main ( String[] args ) {
            Scanner input = new Scanner ( System.in );
            int countThree = 0, countFive = 0;
            System.out.println ("Enter numbers (exit to quit): " );
            while ( true ) {
                String userInput = input.nextLine ( );

                    try {
                        int num = Integer.parseInt ( userInput );
                        try {
                            if (num % 3 == 0 && num % 5 == 0) {
                                countThree++;
                                countFive++;
                                throw new multipleException ( "\nTotal count of 3: " + countThree + " Total count of 5: " + countFive );
                            } else if (num % 3 == 0) countThree++;
                            else if (num % 5 == 0) countFive++;

                        } catch (multipleException e) {
                            System.out.println (e.getMessage () );
                            break;
                        }
                    } catch (NumberFormatException e) {
                        System.out.println ( "Invalid Input " + e.getMessage ( ) );
                    }
                }
            }
        }

