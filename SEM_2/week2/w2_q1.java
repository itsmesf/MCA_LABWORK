import java.util.Scanner;
public class w2_q1{
    public static void main(String[] args){
        
        Scanner input = new Scanner(System.in);
        
        int even = 0,odd = 0,num = 0;
        
        System.out.println("Enter numbers (-1 to exit): ");
        
        while(num != -1){
           num = input.nextInt();
           if(num%2==0) even++;
           else odd++; 
        }
        System.out.println("\nEven Count: " + even);
        System.out.println("Odd Count: " + odd);
    
    }
}
