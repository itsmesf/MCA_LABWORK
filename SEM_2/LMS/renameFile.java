package LMS;

import java.io.File;

public class renameFile {
    public static void main ( String[] args ) {

        File abc = new File ( "C:\\Users\\OneDrive\\Desktop\\abc.txt" );  //existing file
        File xyz = new File ( "C:\\Users\\OneDrive\\Desktop\\xyz.txt" );  // existing file
        File temp = new File ( "C:\\Users\\OneDrive\\Desktop\\temp.txt" ); //non-existing file

       abc.renameTo (temp );   //---------abc --------> temp;   // abc will become non-existing and temp will become existing
       xyz.renameTo ( abc );    //----------xyz --------> abc   //  xyz will become non-existing and abc will become non-existing
      temp.renameTo ( xyz ); //-----------temp --------> xyz   // temp will  become non-existing and xyz will become existing
    } // that's how we can swap the names of the files ,and we have to use third non-existing file because two files with the same
    //name cannot exist in one folder. And swapping of files doesn't work variable swapping.

}
