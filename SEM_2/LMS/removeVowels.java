package LMS;

import java.util.Scanner;

public class removeVowels {
    public static void main ( String[] args ) {
        System.out.print ("Enter a string: " );
        Scanner sc = new Scanner ( System.in );
        StringBuffer str = new StringBuffer (sc.nextLine ( )) ;

        for(int i = 0; i< str.length ( );i++){
            char c = Character.toLowerCase ( str.charAt ( i ) );

            if(c=='a' || c =='e' || c == 'i' || c == 'o' || c == 'u') {
                str.deleteCharAt ( i );
                i--;
            }
        }

        System.out.println (str );
    }
}
