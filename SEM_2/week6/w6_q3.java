package week6;

import java.util.Scanner;
import java.util.ArrayList;

public class w6_q3 {

    public static boolean isLexicographicallySmaller(String s1, String s2){
        int minLen = Math.min(s1.length (),s2.length ());
        for(int i = 0; i<minLen;i++){

            char c1 = Character.toLowerCase(s1.charAt(i));
            char c2 = Character.toLowerCase(s2.charAt(i));

            if(c1!=c2)
                return c1 < c2;
        }
        return s1.length()<s2.length();
    }
    public static void main ( String[] args ) {
        Scanner input = new Scanner(System.in);
        ArrayList<String> str = new ArrayList<>();
        System.out.print ("Enter a text: ");
        for(int i = 0; i<3;i++){
            str.add(input.next());
        }

        for(int i = 0; i< str.size()-1;i++) {
                boolean result = isLexicographicallySmaller ( str.get ( i ), str.get ( i + 1 ) );
                if (!result) {
                    String temp = str.get ( i );
                    str.set ( i, str.get ( i + 1 ) );
                    str.set ( i + 1, temp );
                }
        }

        if(!isLexicographicallySmaller ( str.get(0), str.get(1))){
            String temp = str.get(0);
            str.set(0, str.get(1));
            str.set(1, temp);
        }

        System.out.print("\nSorted Words: ");
        for (String word : str) {
            System.out.print(word + " ");
        }
        input.close();
    }
}
