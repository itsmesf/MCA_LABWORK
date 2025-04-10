package LMS;

public class nearestPrime {

    static boolean isPrime(int n){
        boolean isPrime = true;
        if(n==2) return true;
        for(int i = 2; i<n/2; i++){
            if(n%i==0){
                isPrime = false;
                break;
            }
        }

        if(isPrime){
            return true;
        }

        return false;
    }

    static int NearestPrime(int n){
        int max = n+1;
        int min = n-1;
        int np;
        while(true){
            if(isPrime ( max )){
                np = max;
                break;
            }

            if(isPrime ( min )){
                np = min;
                break;
            }

            max++;
            min--;
        }

        return np;
    }

    public static void main ( String[] args ) {

        int num = 31;
        System.out.println ("Nearest Prime: " + NearestPrime ( num ) );

    }

}
