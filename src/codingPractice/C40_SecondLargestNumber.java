package codingPractice;

import java.util.Arrays;

public class C40_SecondLargestNumber {
    public static void main(String[] args) {
        int[] numbers = {12, 34, 10, 1};
        Arrays.sort(numbers);
        System.out.println("Second largest element is: " +numbers[numbers.length-2]);
    }
}
