package LMS;

import java.util.ArrayList;

public class maximumInstancesSubstring {

    static void maxSubStrInstance(String str){

        int k = 0;
        ArrayList<Character> arr = new ArrayList<> (  );
        ArrayList<String> sorted = new ArrayList<> ();
        while(k<str.length ()-1){
            if(str.charAt ( k )!=(int) 32) {
                arr.add ( str.toLowerCase ( ).charAt ( k ) );
            }
            k++;
        }

        int n = arr.size ( );

        for(int i = 0; i<n-1;i++){
            StringBuilder ss = new StringBuilder ();
            for(int j = i; j<=i+1;j++){
                ss.append ( arr.get ( j ) );

            }
            sorted.add ( ss.toString ( ) );
          //  System.out.println (ss );
        }

        sorted.sort ( null );

        int maxCount = 0, minCount = Integer.MAX_VALUE;
        int count = 1;
        String prev = sorted.get ( 0 ), maxStr = "", minStr = "";

        for(int i =1 ; i<sorted.size ();i++){
            if(sorted.get(i).equals ( prev)){
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
                prev = sorted.get ( i );
            }


        }

//        if (count > maxCount) {
//            maxCount = count;
//            maxStr = prev;
//        }
//        if (count < minCount) {
//            minCount = count;
//            minStr = prev;
//        }

        System.out.println("Most frequent substring: " + maxStr + " (Count: " + maxCount + ")");
        System.out.println("Least frequent substring: " + minStr + " (Count: " + minCount + ")");


    }
    public static void main ( String[] args ) {

        String s = "Bana want Banana" ;
        maxSubStrInstance ( s );

    }
}
