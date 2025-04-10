package week1;

import java.util.Scanner;
public class w1_q1{
      
    static String country = "India";

    public static void main(String[] args){
        
        String name, house_no, street, locality, city, pincode, state;

        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter student name: ");
        name = input.nextLine();
        
        System.out.print("Enter house name/number: ");
        house_no = input.nextLine();
        
        System.out.print("Enter street: ");
        street = input.nextLine();
         
        System.out.print("Enter locality: ");
        locality = input.nextLine();
         
        System.out.print("Enter city: ");
        city = input.nextLine();
         
        System.out.print("Enter pincode: ");
        pincode = input.next();
        input.nextLine();
         
        System.out.print("Enter state: ");
        state = input.nextLine();
        
        System.out.println();
        
        System.out.println(name + "'s address");
        System.out.println(house_no+ ", "+ street + ", " + locality);
        System.out.println(city+ ", " + pincode);
        System.out.println(state + ", " + country);
        
    }
}
