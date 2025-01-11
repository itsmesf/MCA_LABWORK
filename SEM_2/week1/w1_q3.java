import java.util.Scanner;

public class w1_q3{
    public static void main(String[] args){
        
        float num1, num2;
        
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter two numbers: ");
        num1 = input.nextFloat();
        num2 = input.nextFloat();
        
        float sum = num1 + num2;
        
        System.out.println("Sum: " + sum);
        
    }
}
