package LMS;

import java.util.*;
public class SortCharInWords {
    public static void main ( String[] args ) {

        String text = "we live in aligarh";
        String sorted = "";

        StringTokenizer words= new StringTokenizer ( text, " " );

        while(words.hasMoreTokens ()){
            char[] charArray = words.nextToken ().toCharArray ();
            int n = charArray.length;
            for(int i=0 ; i<n-1; i++){
                for(int j = 0; j<n-1-i; j++){
                    if(charArray[j] > charArray[j+1]){
                        char temp = charArray[j];
                        charArray[j] = charArray[j+1];
                        charArray[j+1] = temp;
                    }
                }
            }

            sorted+=new String ( charArray) +" ";
        }

        System.out.println ("Sorted Text: " + sorted.trim () );

    }
}
