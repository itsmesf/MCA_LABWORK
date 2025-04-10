package LMS;

import java.util.Arrays;
import java.util.StringTokenizer;

public class SortStringLexographically {



    static boolean lexographicallySmaller(String s1, String s2){
        int minLen = Math.min ( s1.length (),s2.length () );
        for(int i = 0; i<minLen; i++){
            char c1 = Character.toLowerCase (s1.charAt ( i )  );
            char c2 = Character.toLowerCase (s2.charAt ( i )  );

            if(c1!=c2){
                return c1<c2;
            }
        }

        return s1.length ()<s2.length ();
    }
    public static void main ( String[] args ) {
        String[] array = new String[3];

        String text = "I am living in Aligarh. Aligarh Muslim University is situated in Aligarh. Aligarh is also famous for lock industry.";
        String Sorted = "";

        StringTokenizer line = new StringTokenizer ( text, "." );
        int i = 0;
        while(line.hasMoreTokens ()) {
            String str = line.nextToken ( ).trim ( );
            array[i] = str;
            i++;
        }

        for(int k = 0 ; k<2;k++){
            if(!lexographicallySmaller(array[k], array[k+1])){
                String temp = array[k];
                array[k] = array[k+1];
                array[k+1] =  temp;
            }
        }

        if(!lexographicallySmaller(array[0], array[1])){
            String temp = array[0];
            array[0] = array[1];
            array[1] =  temp;
        }

        for(int j = 0; j<3; j++){
            Sorted+=array[j] + ". ";
        }

        System.out.println ("Sorted Array: " +Sorted.trim() );
    }
}
