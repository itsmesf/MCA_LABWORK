package LMS;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.LinkedHashSet;

public class CommonWordsInTwoFiles {
    public static void main ( String[] args ) {
        String file1 = "C:\\Users\\fatim\\OneDrive\\Desktop\\abc.txt";
        String file2 = "C:\\Users\\fatim\\OneDrive\\Desktop\\xyz.txt";

        LinkedHashSet<String> file1Words = new LinkedHashSet<> (  );
        LinkedHashSet<String> file2Words = new LinkedHashSet<> (  );
        LinkedHashSet<String> commonWords = new LinkedHashSet<> (  );

        try(BufferedReader reader1 = new BufferedReader (new FileReader ( new File ( file1 ) ) );
        BufferedReader reader2 = new BufferedReader ( new FileReader ( new File ( file2 ) ) )){
            String line1 , line2;
            while(((line1 = reader1.readLine ())!= null) | ((line2 = reader2.readLine ())!= null)){
                if (line1 != null) {
                    String[] word1 = line1.split ( " " );
                    file1Words.addAll ( Arrays.asList (  word1) );
                }

                if(line2!=null){
                    String[] word2 = line2.split ( " " );
                    file2Words.addAll ( Arrays.asList ( word2 ) );
                }

            }

        }catch(IOException e){
            System.out.println (e.getMessage () );
        }

        System.out.println ("Common words: " );
        for(String x: file1Words){
            for(String y: file2Words){
                if(x.equalsIgnoreCase ( y )){
                    commonWords.add ( x );
                }
            }
        }

        System.out.print( commonWords);

    }
}
