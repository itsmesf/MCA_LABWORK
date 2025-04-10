package LMS;

import java.util.Arrays;

public class MissingNumber {
    public static void main ( String[] args ) {

        int n = 10;
        int num = 1;
        int[] arr = {1, 2, 3, 5, 6, 7, 8, 9, 10};
        Arrays.sort ( arr );
        for (int i = 0; i < n; i++) {
            if (arr[i] != num) {
                break;
            }
            num++;
        }

        System.out.println ("Missing Number: " + num );
    }
}
