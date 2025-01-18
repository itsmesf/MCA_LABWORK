public class w2_q3{
    public static void main(String[] args){
        double sum = 0;
        
        for(int i = 1; i<=10; i++){
            sum+=(1/(double)i);   
        }

        System.out.println("\nSum of reciprocals: "+ Math.round(sum*100.0) /100.0);
    }
}
