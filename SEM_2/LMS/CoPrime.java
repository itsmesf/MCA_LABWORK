package LMS;

public class CoPrime {
    static int gcd(int a, int b){
        if(b==0)
            return a;
        return gcd(b, a%b);
    }

    public static void main ( String[] args ) {
        int n =34;

        for(int i = 1 ; i<=n; i++){
            if(gcd(i,n) == 1){
                System.out.print (i + "  " );
            }
        }
    }
}
