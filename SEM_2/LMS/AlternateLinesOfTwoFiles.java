package LMS;

import java.io.*;

public class AlternateLinesOfTwoFiles {

    //If we want to read both files simultaneously use bitwise OR ( | )
    //If we want one file to completely read first and then read second file afterward use logical OR (||)

    public static void createNewFile(String Path) throws IOException{
        File both = new File ( Path );
        if(both.exists ()){
            System.out.println ("File already exists" );
        }else{
            both.createNewFile ();
            System.out.println ("File created successfully" );
        }
    }

    public static void readAndWriteFile(String Pabc, String Pxyz, String Pboth) throws IOException {

        try (BufferedReader rabc = new BufferedReader ( new FileReader ( new File ( Pabc ) ) );
             BufferedReader rxyz = new BufferedReader ( new FileReader ( new File ( Pxyz ) ) );
             BufferedWriter wboth = new BufferedWriter ( new FileWriter ( new File ( Pboth ) ) ))
        {
            String line1 , line2;
            while (((line1 = rabc.readLine ())!=null) | ((line2 = rxyz.readLine ())!=null) ){
                if (line1 != null) {
                    wboth.write(line1);
                    wboth.newLine();
                }
                if (line2 != null) {
                    wboth.write(line2);
                    wboth.newLine();
                }
            }
        }
        catch(FileNotFoundException e){
        System.out.println (e.getMessage () );
        }

    }

    public static void main ( String[] args ) {

        String abc = "C:\\Users\\fatim\\OneDrive\\Desktop\\abc.txt";
        String xyz = "C:\\Users\\fatim\\OneDrive\\Desktop\\xyz.txt";
        String both ="C:\\Users\\fatim\\OneDrive\\Desktop\\both.txt";

        try {
            createNewFile ( both);
            readAndWriteFile (abc,xyz,both );

        }catch (IOException e){
            System.out.println (e.getMessage () );
        }

    }
}
