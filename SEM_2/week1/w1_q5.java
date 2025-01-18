
import java.util.Scanner;

public class w1_q5 {
  public static void main(String args[]) {
    
    double num1, num2, sum , diff, product, quotient, min, max;
    Scanner input = new Scanner(System.in);
    
    System.out.print("Enter two numbers: ");
    num1 = input.nextDouble();
    num2 = input.nextDouble();
    
    //Operations on numbers
    
    sum = num1 + num2;
    diff = num1 - num2;
    product = num1 * num2;
    quotient = (num2 == 0)? Double.NaN : num1/num2;
    max = (num1 > num2)? num1 : num2;
    min = (num1 == max) ? num2 : num1;
    
    System.out.println("Sum of numbers = " + sum);
    System.out.println("Difference of numbers  = " + diff);
    System.out.println("Product of numbers  = " + product);
    System.out.printf("Quotient of numbers  = %.2f%n" ,quotient);
    System.out.println("Maximum of numbers = " + max);
    System.out.println("Minimum of numbers = " + min);
  }
}
