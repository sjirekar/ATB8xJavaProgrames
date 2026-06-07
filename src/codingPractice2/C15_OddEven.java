package codingPractice2;

import java.util.Scanner;

public class C15_OddEven {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int number = sc.nextInt();
        if (number%2==0)
        {
            System.out.println(number + " Is Even");
        }else {
            System.out.println(number + " Is Odd");
        }
    }
}
