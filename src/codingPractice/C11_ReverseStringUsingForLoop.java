package codingPractice;

import java.util.Scanner;

public class C11_ReverseStringUsingForLoop {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the input String: ");
        String input = scanner.nextLine();

        String reverse = "";
        for(int i = input.length()-1; i >=0 ; i--) {
            reverse = reverse + input.charAt(i);
        }
        System.out.println("Reversed string is: " +reverse);
    }
}
