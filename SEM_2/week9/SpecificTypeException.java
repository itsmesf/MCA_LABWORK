package week9;

import java.io.*;
public class SpecificTypeException {
    static void readFromFile(String Path){

        try(FileReader reader = new FileReader ( new File ( Path ) )){

            int Char;
            while((Char = reader.read ())!=-1){
                System.out.println ((char) Char );
            }

        }catch (FileNotFoundException e){
            System.err.println("Error: File not found!");
        }catch (IOException e){
            System.err.println("Error: IO Exception occurred!");
        }catch (Exception e){
            System.err.println("Error: Some other exception occurred!");
        }
    }

    public static void main ( String[] args ) {

        readFromFile ( "test.txt" );
    }
}
