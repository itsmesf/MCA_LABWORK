package week4;

import java.util.*;
public class stringTokenizer {
    public static void main(String[] args) {

        int sentenceCount = 0, wordCount = 0, zCount = 0 , eCount = 0;

        Scanner input = new Scanner(System.in);
        System.out.println("Enter text: ");
        String text = input.nextLine();
        input.close();
        StringTokenizer tokenizer = new StringTokenizer(text , ".!?");

        while(tokenizer.hasMoreTokens()){
            String line = tokenizer.nextToken().trim();
            StringTokenizer wordTokenizer = new StringTokenizer(line , " ");

            while(wordTokenizer.hasMoreTokens()) {
                String word = wordTokenizer.nextToken();
                wordCount++;

                for(char ch: word.toCharArray()){
                    if(ch == 'z' || ch == 'Z') zCount++;
                    if(ch == 'e' || ch == 'E') eCount++;
                }
            }
            sentenceCount++;
        }

        System.out.println("\nCount of Sentences in a text: " + sentenceCount);
        System.out.println("Count of words in a text: " + wordCount);
        System.out.println("Count of 'z' char in a text: " + zCount);
        System.out.println("Count of 'e' char in a text: " + eCount);

    }
}
