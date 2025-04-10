package LMS;

import java.util.Arrays;

public class AnagramCheck
{

    static boolean isAnagram(String s1, String s2){
        char[] Str1 = s1.toLowerCase ().toCharArray ();
        char[] Str2 = s2.toLowerCase ().toCharArray ();
        Arrays.sort ( Str1 );
        Arrays.sort ( Str2 );
        System.out.println (Str1 );
        System.out.println (Str2 );

        if(Str1.length!=Str2.length){
            return false;
        }

        else{
            int n = Str1.length;
            for(int i = 0; i<n; i++){
                if(Str1[i] != Str2[i]){
                    return false;
                }
            }
        }

        return true;
    }
    public static void main ( String[] args ) {

        String s1 = "Listen";
        String s2 = "Silent";

        System.out.println ("Are the Strings Anagram: " + isAnagram ( s1,s2 ) );

    }
}
