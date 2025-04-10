package LMS;

import java.io.*;
import java.util.ArrayList;

public class SwapHalfOfFileWithAnotherFile {


    //Case1: When number of lines are equal in both files.
    static ArrayList<String> SwapHalfOfEqualSizeFiles(ArrayList<String> FileABC, ArrayList<String> FileXYZ){
        StringBuilder Str1 = new StringBuilder (  );
        StringBuilder Str2 = new StringBuilder (  );
        ArrayList<String> replacedLines = new ArrayList<> ();
        double n = FileABC.size () , m = FileXYZ.size ();

        if(n==m){
            int a =(int) Math.ceil ((n/2) );
            int b =(int) Math.floor ( (n/2) );


            for(int i = 0; i<n;i++){
                if(i<b){
                    Str1.append (FileXYZ.get ( i+a )).append ( "\n" );
                    Str2.append (FileXYZ.get ( i )).append ( "\n" );
                }
                else{
                    Str1.append ( FileABC.get ( i )).append ( "\n" );
                    if((a!=b) && (i == b)){
                        Str2.append ( FileXYZ.get ( i ) ).append ( "\n" );
                    }else{
                        Str2.append ( FileABC.get ( i-a) ).append ( "\n" );
                    }
                }
            }
            replacedLines.add (Str1.toString ());
            replacedLines.add ( Str2.toString () );
        }
        return  replacedLines;
    }

    //Case2: When number of lines are notequal in both files.
    static ArrayList<String> SwapHalfOfUnEqualSizeFiles(ArrayList<String> FileABC, ArrayList<String> FileXYZ) {
        StringBuilder Str1 = new StringBuilder ( );
        StringBuilder Str2 = new StringBuilder ( );
        ArrayList<String> replacedLines = new ArrayList<> ( );
        double n = FileABC.size ( ), m = FileXYZ.size ( );
        System.out.println ( n + "  " + m );
        int a = 0, b = 0;
        if (m < n) {
            a = (int) Math.ceil ( (m / 2) );
            b = (int) Math.floor ( (m / 2) );
            for (int i = 0; i < m; i++) {
                if (i < b) {
                    Str1.append ( FileXYZ.get ( i + a ) ).append ( "\n" );
                    Str2.append ( FileXYZ.get ( i ) ).append ( "\n" );
                } else {
                    Str1.append ( FileABC.get ( i ) ).append ( "\n" );
                    if ((a != b) && (i == b)) {
                        Str2.append ( FileXYZ.get ( i ) ).append ( "\n" );
                    } else {
                        Str2.append ( FileABC.get ( i - a ) ).append ( "\n" );
                    }
                }
            }
            for(double i =m ; i<n;i++){
                Str1.append ( FileABC.get ( (int)i ) ).append ( "\n" );
            }

        } else {
            a = (int) Math.ceil ( (n / 2) );
            b = (int) Math.floor ( (n / 2) );
            for (int i = 0; i < n; i++) {
                if (i < a) {
                    Str1.append ( FileABC.get ( i ) ).append ( "\n" );

                    if (i < b) {
                        Str2.append ( FileABC.get ( i + a ) ).append ( "\n" );
                    }
                    else {
                        Str2.append ( FileXYZ.get ( i ) ).append ( "\n" );
                    }

                }
                    else {
                    Str1.append ( FileXYZ.get ( i-a ) ).append ( "\n" );
                    Str2.append ( FileXYZ.get ( i ) ).append ( "\n" );
                }
            }
            for(double i =n ; i<m;i++){
                Str2.append ( FileXYZ.get ( (int)i ) ).append ( "\n" );
            }
        }

            System.out.println ( a + "  " + b );

            replacedLines.add (Str1.toString ());
            replacedLines.add ( Str2.toString () );
            return  replacedLines;
    }

    public static void main ( String[] args ) {
        File abc = new File ( "C:\\Users\\fatim\\OneDrive\\Desktop\\abc.txt" );
        File xyz = new File ( "C:\\Users\\fatim\\OneDrive\\Desktop\\xyz.txt" );

        ArrayList<String> fileabc = new ArrayList<> ( );
        ArrayList<String> filexyz = new ArrayList<> ( );
        int ACount = 0, BCount = 0;
        try (BufferedReader babc = new BufferedReader ( new FileReader ( abc ) );
             BufferedReader bxyz = new BufferedReader ( new FileReader ( xyz ) )) {
            String line1 = null, line2 = null;
            while ( ((line1 = babc.readLine ( )) != null) || ((line2 = bxyz.readLine ( )) != null) ) {
                if (line1 != null) {
                    fileabc.add ( line1 );
                    ACount++;
                }
                if (line2 != null) {
                    filexyz.add ( line2 );
                    BCount++;
                }
            }

        }  catch (IOException e) {
            System.out.println ( e.getMessage ( ) );
        }

        ArrayList<String> data = null;
        if(ACount == BCount){
            data = SwapHalfOfEqualSizeFiles ( fileabc, filexyz );
        }else{
            data = SwapHalfOfUnEqualSizeFiles ( fileabc, filexyz );
        }

        System.out.println (data );

     try (BufferedWriter rabc = new BufferedWriter ( new FileWriter ( abc ) );
             BufferedWriter rxyz = new BufferedWriter ( new FileWriter ( xyz ) ))
        {
            rabc.write ( data.get ( 0 ) );
            rxyz.write ( data.get ( 1 ) );
            System.out.println ("Lines swapped successfully" );

        } catch (IOException e) {
            System.out.println ( e.getMessage ( ) );
        }

    }
}
