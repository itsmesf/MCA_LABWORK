package LMS;

public class LargestFibonacci {

    static int fibonacci(int num){
        if(num==0 ){
            return 0;
        }

        else if(num==1 ) return 1;
        return fibonacci ( num-1 ) + fibonacci ( num-2 );
    }

    public static void main ( String[] args ) {

        int num1 = 15;
        int num2 = 35;
        int i = 0;

        while(fibonacci ( i )<num2){
            i++;
        }

        if(fibonacci ( i-1 ) >num1 && fibonacci ( i-1 ) < num2){
            System.out.println (fibonacci ( i-1 ) );
        }


    }
}
