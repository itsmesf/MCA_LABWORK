/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package week6;

/**
 *
 * @author CSD
 */
import java.util.*;
import java.lang.String;
public class w6_q1 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Input text: ");
        String text = input.nextLine();
       StringTokenizer words = new StringTokenizer(text , " ");
       System.out.print("Output Text: ");
       while(words.hasMoreTokens()){
           String word =  words.nextToken();
           String revWord = "";
           for(int i = word.length() - 1; i >= 0; i--){
                char ch = word.charAt(i);
                // Check if the character is a letter
                if((ch >= 'A' && ch <= 'Z') || (ch >= 'a' && ch <= 'z')){
                    revWord = revWord + ch;
                }
       }

           if(word.length()!=revWord.length()){
               revWord+=word.charAt(word.length()-1);
           }
           
           System.out.print(revWord+ " ");
    }
       System.out.println();
 }
}
