import java.util.Scanner;
import java.util.ArrayList;
public class w3_q4 {
    static void display_Digits(int num){
        ArrayList<Integer> digits = new ArrayList<>();
        while(num!=0){
            int r = num%10;
            digits.add(0,r);

            num /=10;
        }

        for(int digit: digits){
            System.out.println("Digits of a entered number: " +digit);
        }
    }
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        //Integer is wrapper class, allows us to use primitive data types as objects. Size is 16 bytes.
        int num;
        System.out.println("Enter a four digit number: ");
        num = input.nextInt();

        display_Digits(num);
    }
}
