package LMS;

import java.util.*;

public class SubString {
    static boolean isGreater(String s1, String s2){
        return s1.length ()>s2.length ();
    }

    static String subStr ( String s1 ) {
        ArrayList<String> subStrings = new ArrayList<> (  );
        char[] arr = s1.toLowerCase ( ).toCharArray ( );
        int n = arr.length;
        for (int i = 0; i < n ; i++) {
            String ss = "";
            for (int j = i; j < n; j++) {
                ss += arr[j];
                 subStrings.add ( ss );
            }
        }

        System.out.println (subStrings );

        for(int i = 0; i<subStrings.size()-1; i++){
            for(int j = 0; j<subStrings.size()-1-i;j++){
                boolean result = isGreater(subStrings.get(j) , subStrings.get(j+1));

                if(!result){
                    String temp = subStrings.get(j);
                    subStrings.set(j,subStrings.get(j+1));
                    subStrings.set(j+1, temp);
                }
            }
        }
        System.out.println (subStrings );

        return subStrings.get ( 0 );

    }

    public static void main ( String[] args ) {
        String s1 = "Aligarh";
        System.out.println ( subStr ( s1 ));
    }
}

