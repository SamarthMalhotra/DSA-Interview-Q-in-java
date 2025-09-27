// This is very important Q must check it before interview.
//It is only for Square Matrix
//import java.util.*;
public class MultiDimantionalArrayDiagonalSum {
    public static long sum(int arr[][]) {
        long sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i][i];

            if (i != arr.length - i - 1) {
                sum += arr[i][arr.length - i - 1];
            }

        }
        return sum;
    }

    public static void main(String args[]) {
        int arr[][] = {
                { 1, 2, 3, 4 },
                { 5, 6, 7, 8 },
                { 9, 10, 11, 12 },
                { 13, 14, 15, 16 }
        };
        long add = sum(arr);
        System.out.println("The sum of both diagonal values :" + add);
    }
}