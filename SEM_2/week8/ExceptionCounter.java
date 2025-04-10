package week8;

import java.io.*;
public class ExceptionCounter {

    int countExceptions(String filePath){
        int ExceptionCount  = 0;
        try{
            BufferedReader reader = new BufferedReader(new FileReader(filePath));
            String line;
            while((line=reader.readLine())!=null){
                String[] arr = line.split(" ");

                for(int i = 0; i<arr.length;i++){
                    String word = arr[i];
                    if(word.equals("throw") || word.equals("throws")||word.equals("catch")){
                        ExceptionCount++;
                    }
                }

            }
            reader.close();
        } catch(FileNotFoundException e){
            System.out.println("An error occurred: " + e.getMessage());
        } catch(IOException e){
            System.out.println("An error occurred: " + e.getMessage());
        }

        return ExceptionCount;
    }

    public static void main(String[] args){
        ExceptionCounter obj = new ExceptionCounter();
        System.out.println("Exception Count: " + obj.countExceptions("SEM_2/LMS/countUsingTryCatch.java"));
    }
}
