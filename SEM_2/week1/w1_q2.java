//F to C conversion

import java.util.ArrayList;
import java.util.Scanner;

public class w1_q2{
    public static void main(String[] args){
        
        double celsius, fahrenheit;
        ArrayList<Double> tempCelsius = new ArrayList<>();
        ArrayList<Double> tempFah = new ArrayList<>();
        
        Scanner input = new Scanner(System.in);
        
        while(true){
            System.out.print("Enter temperature in fahrenheit('exit' to quit): ");
            String userinput = input.nextLine();
            
            if(userinput.equalsIgnoreCase("exit")){
                break;
            }
        
            try{
               fahrenheit = Double.parseDouble(userinput);
               tempFah.add(fahrenheit);
               celsius  = (fahrenheit - 32) / 1.8;
               tempCelsius.add( celsius);
             
            }
            catch (NumberFormatException e) {
                System.out.println("Invalid input. Please enter a valid number or 'exit' to quit.");
            }
            
        } 
        
       
        System.out.println("\nFahrenheit to Celsius Conversion List\n");
        System.out.printf("%-15s %-15s%n", "Fahrenheit", "Celsius");
        System.out.println("-----------------------------");
        
        for (int i = 0; i < tempFah.size(); i++) {
            System.out.printf("%-15s %-15.2f%n", tempFah.get(i), tempCelsius.get(i));
        }

        input.close();
    }
}
