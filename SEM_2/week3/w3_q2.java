import java.util.Scanner;
public class w3_q2{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int[] array = new int[3];
        int count = 0;
        System.out.print("Enter three numbers (0 - 9): ");
        
        for(int i = 0; i <3 ; i++ ){
            array[i] = input.nextInt();
        }
        
        System.out.println("Possible Combinations: ");
        for(int i = 0 ; i < 3 ; i++){
            while(count < 2){
            System.out.println( array[0] + " , " + array[1] + " , " + array[2]);
            if(count == 1) break;
            int temp = array[1];
            array[1] = array[2];
            array[2] = temp;
            count++;
            }
            
            int newtemp = array[0];
            array[0] = array[1];
            array[1] = newtemp;
            
            count = 0;
            
        }
    
    }
}
