import java.util.Scanner;
public class w2_q5b{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int num,sum = 0;
        
        System.out.print("Enter number of rows to be printed in Floyd's Triangle: ");
        num = input.nextInt();
        
        for(int i = 1; i<=num; i++){
            for(int j = 0; j<i ; j++){
                sum++;
                if(sum>1 ){
                    sum = 0;
                }
                System.out.print(sum + "  ");
            }
            if (i%2==0){
                sum = 0;
            }
            System.out.println();
        }
    }
}
