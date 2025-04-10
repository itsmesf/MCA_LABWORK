package week8;

public class NullPointerExceptionHandler {

    //Using default exception handling class.
    void ExceptionHandlerClass(){
        String s = null;
        try{
            System.out.println (s.length () );
        }catch (Exception e){
            System.out.println ("Null Pointer exception occurred: " + e.getMessage () );
        }
    }

    //Using more specific null pointer exception class.
    void NullPointerExceptionClass(){
        String s = null;
        try{
            System.out.println (s.length () );
        }catch (NullPointerException e){
            System.out.println ("Null Pointer exception occurred" );
        }
    }

    //using preventive measures, checking null values using if-else
    void preventWithNullCheck(){
        String s = null;
        if(s != null){
            System.out.println ("The length of string is: " + s.length ());
        }else{
            System.out.println ("Null Pointer exception encountered" );
        }
    }
    public static void main ( String[] args ) {

        NullPointerExceptionHandler obj = new NullPointerExceptionHandler ();
        obj.ExceptionHandlerClass ();
        obj.NullPointerExceptionClass ( );
        obj.preventWithNullCheck ();

    }
}
