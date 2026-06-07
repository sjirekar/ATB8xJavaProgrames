package codingPractice2;

import java.util.Scanner;

public class C18_ReverseNumber {
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int number = scanner.nextInt();

        int reversed = 0;
        while (number!=0)
        {
            int digit = number%10;   // get last digit
            reversed =reversed*10+digit; // build reversed number
            number = number/10; // remove last digit
        }
        System.out.println(reversed);

    }
}
