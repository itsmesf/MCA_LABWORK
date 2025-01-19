import java.util.Scanner;

public class w3_q2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] array = new int[3];
        System.out.print("Enter three numbers (0 - 9): ");
        
        for (int i = 0; i < 3; i++) {
            array[i] = input.nextInt();
        }
        
        System.out.println("Possible Combinations: ");
        
        // Generate permutations
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                for (int k = 0; k < 3; k++) {
                    if (i != j && i != k && j != k) {
                        System.out.println(array[i] + " , " + array[j] + " , " + array[k]);
                    }
                }
            }
        }
    }
}

            
        }
    
    }
}
