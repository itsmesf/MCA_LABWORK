package week4;

import java.util.*;
class OddAndEven {

    int countOfOdd =0 , countOfEven =0 , num;

    void addNumber(int num){
        if(num%2==0) countOfOdd++;
        else countOfEven++;
    }

    void tostring(){
        System.out.println("Count of Odd: "+countOfOdd + " ," +"Count of Even: " +countOfEven);
    }
}

public class TestOddAndEven{

    OddAndEven obj = new OddAndEven();
    Scanner input = new Scanner(System.in);

    void enterNumber(){

        System.out.println("Enter number('q' to exit): ");
        while(true){
            String userInput = input.nextLine();
            if(userInput.equalsIgnoreCase("q")){
                break;
            }

            try{
                obj.num = Integer.parseInt(userInput);
            }

            catch (NumberFormatException e) {
                System.out.println("Invalid input. Please enter a valid number or 'exit' to quit.");
            }
            obj.addNumber(obj.num);
        }
        obj.tostring();
    }
    public static void main(String[] args){

        TestOddAndEven t1 = new TestOddAndEven();
        t1.enterNumber();
    }

}

