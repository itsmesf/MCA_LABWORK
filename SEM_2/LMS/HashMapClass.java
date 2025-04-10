package LMS;

import java.util.*;
public class HashMapClass {
    public static void main ( String[] args ) {

        String s = "Aligarh Muslim University. Aligarh Muslim University is situated in Aligarh.";
        String[] words = s.replace ( ".", "" ).trim().split ( " " );

        LinkedHashSet<String> word = new LinkedHashSet<> ();

        for(String x: words){
            x = x.toLowerCase ();
            word.add ( x );
        }

        ArrayList<Integer> WordCount = new ArrayList<> (  );

        for(String x: word){
            int count = 0;
            for(String y: words){
                if(x.equalsIgnoreCase ( y )){
                    count++;
                }
            }
            WordCount.add ( count );
            System.out.println (x + " : " + count );
        }


        /*LinkedHashMap<String, Integer> wordFrequency = new LinkedHashMap<> ( );


        for(String word: words){
            word = word.toLowerCase ();
            wordFrequency.put(word, wordFrequency.getOrDefault ( word,0 )+1);
        }

        System.out.println ("Word Frequency: " );
        for(Map.Entry<String, Integer> entry: wordFrequency.entrySet ( )){
            System.out.println (entry.getKey () + " : " + entry.getValue () );
        }*/

    }
}
