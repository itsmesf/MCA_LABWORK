package LMS;

import java.net.Inet4Address;
import java.util.ArrayList;

public class FilterCharAndNum {
    public static void main ( String[] args ) {

        String s = "My Dob is 23 October 1998";
        ArrayList<Character> alphabets = new ArrayList<> ( );
        ArrayList<Integer> numbers = new ArrayList<> ( );

        for(int i = 0; i<s.length ();i++){
            char Char = s.charAt (i );

            if(Char>='A' && Char <='Z' || Char >='a' && Char <='z'){
                alphabets.add ( Char );
            }
            else if((int) Char == 32){
                continue;
            }
            else{
                int num = Char - '0';
                numbers.add (num );
            }
        }

        System.out.println (numbers );
        System.out.println (alphabets );


    }

}
