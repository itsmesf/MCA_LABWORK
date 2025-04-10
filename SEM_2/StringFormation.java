public class StringFormation {

    static boolean isStringFormed(String text, String subStr){

        int k = 0;
        int n = text.length ();
        for(int i = 0; i<n;i++){
            char c = Character.toLowerCase ( text.charAt ( i ) );
            char s = Character.toLowerCase ( subStr.charAt ( k ) );
            if(c == s){
                k++;
                if(k==subStr.length ()){
                    return true;
                }
            }
        }

        return false;
    }
    public static void main ( String[] args ) {
        String text = "All Indians get visa on arrival in Haiti";
        String subStr = "Alizar";
        System.out.println ("Is String Formed: " + isStringFormed ( text, subStr ));

    }
}
