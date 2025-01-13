package codingPractice;

import java.util.Scanner;

public class C12_ReverseStringUsingStringBuilder {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the string: ");
        String input = scanner.nextLine();

        StringBuilder reversedString = new StringBuilder(input);
        reversedString.reverse();
        System.out.println("Reversed string is " +reversedString);
    }
}
