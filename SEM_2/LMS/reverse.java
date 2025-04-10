package LMS;

import java.util.Scanner;

public class reverse {
    public static void main ( String[] args ) {
        System.out.print ("Enter a string: " );
        Scanner sc = new Scanner ( System.in );
        String str = sc.nextLine ( );

        String[] arr = str.split ( " " );
        StringBuffer words = new StringBuffer ();
            for(String word : arr){
                StringBuffer s= new StringBuffer ( word );
                for(int i = 0; i<(s.length ()/2);i++){
                    char temp = s.charAt ( i );
                    s.setCharAt ( i, s.charAt ( s.length ()-1-i ) );
                    s.setCharAt ( s.length ()-1-i, temp );
                }
               words.append ( s + " " );
            }

        System.out.println (words );

    }
}
