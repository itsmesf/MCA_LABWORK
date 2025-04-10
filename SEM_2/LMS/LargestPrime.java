package LMS;

public class LargestPrime {
    public static void main ( String[] args ) {
        int n1 = 15;
        int n2 = 35;

        for(int i = n2; i>=n1 ; i--){
            boolean isprime = true;
            for(int j = 2; j<=(i/2);j++){
                if(i%j == 0){
                    isprime = false;
                    break;
                }
            }

            if(isprime){
                System.out.println (i );
                break;
            }
        }
    }
}
