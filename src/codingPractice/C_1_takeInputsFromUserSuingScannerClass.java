package codingPractice;

import java.util.Scanner;

public class C_1_takeInputsFromUserSuingScannerClass {
    public static void main(String[] args) {
        ////You can take input from users using the Scanner class////
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your name: ");
        String name = sc.nextLine();
        System.out.println("Enter your age: ");
        int age = sc.nextInt();
        System.out.println("Your name is: " +name+ " Your age is:  " +age);

    }
}
