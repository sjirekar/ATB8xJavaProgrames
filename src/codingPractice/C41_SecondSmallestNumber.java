package codingPractice;

import java.util.Arrays;

public class C41_SecondSmallestNumber {
    public static void main(String[] args) {
        int [] arr = {12, 34, 10, 1};
        Arrays.sort(arr);
        System.out.println("Second smallest number is: " +arr[1]);
    }
}
