package LMS;

import java.util.StringTokenizer;

public class Stringtokenizer {
    public static void main ( String[] args ) {
        String str = "Aligarh Muslim University. It is situated in Aligarh.";
        int sentenceCount = 0, wordCount = 0, charCount = 0;

        StringTokenizer sentence = new StringTokenizer ( str,"[!.?]" );
        sentenceCount+=sentence.countTokens ();
        StringTokenizer words = new StringTokenizer ( str );
        wordCount+=words.countTokens ();
        while(words.hasMoreTokens ()){
            for(char Char: words.nextToken ().toCharArray ()){
                if((int)Char!=46)
                  charCount++;
            }
        }

        System.out.println ("Sentence Count: " + sentenceCount);
        System.out.println ("Word Count: "+wordCount );
        System.out.println ("Character Count: "+charCount );

    }
}
