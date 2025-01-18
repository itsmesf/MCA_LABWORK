import java.util.Scanner;
public class w3_q1{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int num,num1 = 0, num2 = 1 , i = 2;
        
        System.out.print("Enter number to which the series is to be printed: ");
        num = input.nextInt();
        System.out.print("Fibonacci series: " + num1 + " " + num2);
        do{
            int nextNum = num1+num2;
            System.out.print(" "+ nextNum);
            num1 = num2;
            num2 = nextNum;
            i++;
        } while(i<num);
    }
}
