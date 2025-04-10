import java.util.Scanner;

public class w2_q1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int even = 0, odd = 0, num;

        System.out.println("Enter numbers (-1 to exit): ");

        while (true) {
            num = input.nextInt();

            // Exit the loop if -1 is entered
            if (num == -1) {
                break;
            }

            // Check if the number is even or odd
            if (num % 2 == 0) {
                even++;
            } else {
                odd++;
            }
        }

        System.out.println("\nEven Count: " + even);
        System.out.println("Odd Count: " + odd);
    }
}