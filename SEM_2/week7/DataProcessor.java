package week7;

import java.io.*;
import java.util.*;

class invalidDataException extends Exception{
    public invalidDataException(String message){
        super(message);
    }
}

public class DataProcessor {
    static Scanner sc = new Scanner ( System.in );

    void createFile(String filePath){
        try {
            File file = new File ( filePath);
            if (file.createNewFile ( )) {
                System.out.println ( "File created Successfully. File path:  " + file.getAbsolutePath() );
            } else {
                System.out.println ( "File already exists.");
            }
        } catch (IOException e) {
            System.out.println ( "An error occurred: " + e.getMessage ( ) );
        }
    }

    void writeValuesToFile(String filePath){
        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter(filePath,true));
            System.out.println ("Enter text (exit to stop): "  );
            while ( true ){
                String line = sc.nextLine();
                if(line.equalsIgnoreCase ( "exit" )){
                    break;
                }
                writer.write ( line );
                writer.newLine ();
            }
            writer.close();
            System.out.println("Data written to file successfully!");
        } catch (FileNotFoundException e){
            System.out.println ("An error occurred: " + e.getMessage ());
        } catch (IOException e){
            System.out.println ("An error occurred: "+e.getMessage () );
        }
    }

    static boolean validateData(String str) throws invalidDataException {
        try {
            Double.parseDouble ( str );
            return true;
        } catch (NumberFormatException e) {
            throw new invalidDataException ( "Invalid data found: " + str );
        }
    }

    List<Double> readValuesFromFile(String filePath){
        List<Double> values = new ArrayList<> (  );
        try {
           BufferedReader reader = new BufferedReader ( new FileReader ( filePath ) );
           String line;
            System.out.println ("\nReading values from file" );
           while ( (line = reader.readLine ( ))!=null ) {
               try {
                   if (validateData ( line )) {
                       values.add ( Double.parseDouble ( line ) );
                   }
               } catch (invalidDataException e) {
                   System.out.println ( e.getMessage ( ) );
               }
           }
           reader.close ();
        } catch (FileNotFoundException e){
            System.out.println ("An error occurred: " + e.getMessage ());
        } catch (IOException e){
            System.out.println ("An error occurred: "+e.getMessage () );
        }

        return values;
    }

    double calculateAverage(List<Double> validValues){
        if(validValues.isEmpty ()){
            return 0.0;
        }

        double sum  = 0;
        for(double x: validValues){
            sum+=x;
        }
        double average = sum/validValues.size ();
        return average;
    }

    void writeResultToFile(double average,String filePath){
        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter(filePath,true));
            writer.write ( "Average of values: " + average);
            writer.newLine();
            writer.close();
            System.out.println("\nResultant Average written to file successfully!");
        } catch (IOException e){
            System.out.println ("An error occurred: "+e.getMessage () );
        }
    }


    public static void main ( String[] args ){

        DataProcessor obj = new DataProcessor ();

        obj.createFile ( "C:\\Users\\OneDrive\\Desktop\\week7.txt" );
        obj.writeValuesToFile ( "C:\\Users\\OneDrive\\Desktop\\week7.txt" );
        List<Double> values = obj.readValuesFromFile("C:\\Users\\OneDrive\\Desktop\\week7.txt");
        obj.writeResultToFile ( obj.calculateAverage ( values ), "C:\\Users\\OneDrive\\Desktop\\week7r.txt"  );

    }
}
