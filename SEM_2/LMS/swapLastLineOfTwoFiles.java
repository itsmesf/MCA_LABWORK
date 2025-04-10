package LMS;

import java.io.*;
import java.util.ArrayList;

public class swapLastLineOfTwoFiles {  //we need to close both buffered reader and file reader and it throws IOException as well
    public static void main ( String[] args ) {

        File abc = new File ( "C:\\Users\\OneDrive\\Desktop\\abc.txt" );
        File xyz = new File ( "C:\\Users\\OneDrive\\Desktop\\xyz.txt" );

        ArrayList<String> fileabc = new ArrayList<> ( );
        ArrayList<String> filexyz = new ArrayList<> ( );

        try (BufferedReader babc = new BufferedReader ( new FileReader ( abc ) );
             BufferedReader bxyz = new BufferedReader ( new FileReader ( xyz ) )) {
            String line1 = null, line2 = null;
            while ( ((line1 = babc.readLine ( )) != null) || ((line2 = bxyz.readLine ( )) != null) ) {
                if (line1 != null) {
                    fileabc.add ( line1 );
                }
                if (line2 != null) {
                    filexyz.add ( line2 );
                }
            }

            //Replacing last lines of both files
            String temp = fileabc.get ( fileabc.size ( ) - 1 );
            fileabc.set ( fileabc.size ( ) - 1, filexyz.get ( filexyz.size ( ) - 1 ) );
            filexyz.set ( filexyz.size ( ) - 1, temp );

        }  catch (IOException e) {
            System.out.println ( e.getMessage ( ) );
        }

        try (BufferedWriter rabc = new BufferedWriter ( new FileWriter ( abc ) );
             BufferedWriter rxyz = new BufferedWriter ( new FileWriter ( xyz ) ))
        {
           for(String x: fileabc){
               rabc.write ( x );
               rabc.newLine ();
           }

           for(String y: filexyz){
               rxyz.write ( y  );
               rxyz.newLine ();

           }

            System.out.println ("Lines swapped successfully" );
        } catch (IOException e) {
            System.out.println ( e.getMessage ( ) );
        }

    }
}

