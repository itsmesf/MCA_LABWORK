package LMS;

import java.util.ArrayList;

public class countFrequency {
    public static void main ( String[] args ) {

        String s = "Aligarh Aligarh Muslim University. Aligarh Muslim is famous for lock industry as well.";

        String[] sentences = s.split ( "\\." );
        String[] words;
        ArrayList<String> arr = new ArrayList<> ();

        for(int i = 0 ;i<sentences.length;i++){
            words = sentences[i].trim().split ( " " );
            for(String word: words){
                arr.add ( word );
            }
        }

        ArrayList<String> uniqueWords = new ArrayList<> ();
        ArrayList<Integer> frequencyWords = new ArrayList<> ();

        for(int i = 0; i< arr.size ( );i++){
            boolean found = false;
            for(int k = 0; k<uniqueWords.size ();k++){
                if(arr.get ( i ).equalsIgnoreCase (uniqueWords.get ( k ))) {
                    found = true;
                    break;
                }
            }

            if(!found){
                uniqueWords.add ( arr.get ( i ) );
            }

        }

        for(String word: uniqueWords){
            int wordFreq = 0;
            for(int i = 0; i< arr.size ( );i++){
                if(word.equalsIgnoreCase ( arr.get ( i ) )){
                    wordFreq++;
                }
            }
            frequencyWords.add ( wordFreq );
        }


        System.out.println ("Frequency of each word: " );

        for(int i  =0 ;i<uniqueWords.size ();i++ ){
            System.out.println (uniqueWords.get ( i ) + " : " + frequencyWords.get ( i ) );
        }

    }

}
