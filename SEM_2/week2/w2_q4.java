import java.util.Scanner;
public class w2_q4{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int sum = 0,num;
        
        System.out.print("Enter number to which the sum is to calculated: ");
        num = input.nextInt();
        
        for(int i = 2; i<=num; i+=2){
            sum+=i;
        }
        
        System.out.println("\nSum of Series: "+ sum);
    
    }
}
