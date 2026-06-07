package codingPractice2;

import java.util.Scanner;

public class C17_SwapNumbersWOUsingThirdVariable {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the first number: ");
        int a = 5;
        System.out.println("Enter the second number: ");
        int b = 10;
        a = a+b;
        b = a-b;
        a = a-b;
        System.out.println("After swapping the numbers are: a= "+ a + " And b= " + b);
    }
}
