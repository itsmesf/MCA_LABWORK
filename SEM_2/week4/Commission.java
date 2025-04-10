package week4;

import java.util.Scanner;
public class Commission {

    private double sale;

    Commission(double sale){
        this.sale = sale;
    }

    double commission(){
        double commision;
        if(sale>0 && sale < 500){
            commision = (0.02 * sale);
        }
        else if(sale>=500 & sale < 5000){
            commision = 0.05 * sale;
        }
        else{
            commision = 0.08 * sale;
        }
        return commision;
    }
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        double sale;
        String userInput;

        while(true){
            System.out.print("\nEnter the sale amount ('q' to exit): ");
            userInput = input.nextLine();

            if(userInput.equalsIgnoreCase("q")){
                break;
            }

            try{
                sale = Double.parseDouble(userInput);
                if(sale<0){
                    System.out.println("Invalid Input");
                }

                else{
                    Commission c = new Commission(sale);
                    System.out.println("Commission for Rs "+sale + " is " + "Rs " +c.commission());
                }
            }
            catch(NumberFormatException e){
                System.out.println("Invalid input. Please enter a valid number or q to quit.");
            }
        }

    }
}
