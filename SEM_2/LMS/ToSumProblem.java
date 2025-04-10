package LMS;

public class ToSumProblem {
    public static void main ( String[] args ) {

        int TargetSum = 10;
        int[] array = {2, 5,  6, 8, 9, 1};
        System.out.println (array.length );
        for (int i = 0; i < array.length-1 ; i++) {
            int sum = 0;
            for (int j = i+1; j < array.length ; j++) {
                sum = array[i] + array[j];
                if (sum == TargetSum) {
                    System.out.println ( "Target Elements: " + array[i] + ", " + array[j] );
                }
            }

        }
    }
}
