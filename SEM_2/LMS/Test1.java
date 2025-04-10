package LMS;

import java.util.ArrayList;
import java.util.StringTokenizer;

public class Test1{


    public static void main ( String[] args ) {
        String s = "Banana na";
        String newStr = "";
        ArrayList<String> ss = new ArrayList<> (  );
        for (int i = 0; i < s.length ( ); i++) {
            char c = Character.toLowerCase ( s.charAt ( i ) );
            if ((int) s.charAt ( i ) != 32) {
                newStr += c;
            }
        }

        for(int i = 0; i<newStr.length ()-1;i++){
            for(int j = i+1; j<=i+1;j++){
                String subStr = newStr.substring ( i,j+1 );
                ss.add ( subStr );
            }
        }

        ss.sort ( null );

        int maxCount = 0, minCount = Integer.MAX_VALUE, count = 1;
        String maxStr = "", minStr = "", prev = ss.get ( 0 );

        for(int i = 1 ; i<ss.size ();i++){
            if(ss.get ( i ).equals ( prev )){
                 count++;
            }
            else{
                if(count>maxCount){
                    maxCount = count;
                    maxStr = prev;
                }

                if(count<minCount){
                    minCount = count;
                    minStr = prev;
                }

                count = 1;
                prev = ss.get ( i );
            }
        }
        System.out.println("Most frequent substring: " + maxStr + " (Count: " + maxCount + ")");
        System.out.println("Least frequent substring: " + minStr + " (Count: " + minCount + ")");


    }


}