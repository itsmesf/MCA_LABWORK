package week1;
import java.util.Scanner;
public class w1_q4 {
    static int Round(double num){
    int intNum = (int)num;
    if(num >= 0){
        return ((double)intNum + 0.5 <= num && (double)intNum != num) ? intNum + 1 : intNum;
    }
    else{
        return((double)intNum - 0.5 >num && (double)intNum != num) ? intNum-1 : intNum;
        }
    }
    static double Ceil(double num){
        int intNum = (int)num;
        return (num > intNum)? (double)intNum+1 : (double)intNum;
    }
    static double Floor(double num){
        int intNum = (int)num;
        return (intNum < 0 && num != intNum)? (double)intNum-1 : (double)intNum;
    }
    static int integer(double num){
        return (int)num;
    }
  public static void main(String args[]) {
    
    double num, numCeil, numFloor;
    int numInteger, numRound;
    Scanner input = new Scanner(System.in);
    
    System.out.print("Enter a number: ");
    num = input.nextDouble();
    
    //Operations on numbers
    
    numRound = Round(num);
    numCeil = Ceil(num);
    numFloor = Floor(num);
    numInteger = integer(num);
    
    System.out.println("\nNumber after rounding  = " + numRound);
    System.out.println("Ceil value of a number  = " + numCeil);
    System.out.println("Floor value of a number  = " + numFloor);
    System.out.println("Conversion of double to integer  = " +numInteger);
  }
}
