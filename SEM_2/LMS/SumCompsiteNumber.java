package LMS;

public class SumCompsiteNumber {
    public static void main ( String[] args ) {

        int n1 = 10;
        int n2= 15;
        int sum = 0;




        for(int i = n1+1; i<n2;i++){
            boolean iscomposite = false;
            for(int j = 2; j<=(i/2) ;j++){
                if(i%j == 0){
                    iscomposite = true;
                    break;
                }
            }

            if(iscomposite){
                sum+=i;
            }
        }

        System.out.println ("Sum of composite numbers: " + sum);
    }
}
