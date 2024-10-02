package sept.ex_20092024.Task;

import java.util.Scanner;

public class Task_20092024_Task_3 {
    public static void main(String[] args) {
//        ✅ Triangle Classifier ( If)

// Write a program that classifies a triangle based on its side lengths.

// Given three input values representing the lengths of the sides, determine

// if the triangle is equilateral (all sides are equal),

// isosceles (exactly two sides are equal), or

// scalene (no sides are equal).

// Use an if-else statement to classify the triangle.

// side1, side2, side3 ->

        //Logic
        // sides -> double
        //o/p -> string

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of side 1: ");
        double side1 = sc.nextDouble();

        System.out.println("Enter the length of side 2: ");
        double side2 = sc.nextDouble();

        System.out.println("Enter the length of side 3: ");
        double side3 = sc.nextDouble();
        if (side1 >= 1 && side2 >= 1 && side3 >= 1) {
            if (side1 == side2 && side1 == side3 && side2 == side3) {
                System.out.println("Equ");
            } else if (side1 == side2 || side1 == side3 || side2 == side3) {
                System.out.println("Iso");
            } else {
                System.out.println("Scalene");
            }
        } else {
            System.out.println("Negative sides");
        }
        // always as interviewer and give them extra
        // edge case you hae to gve them and if u can hande thenm wrk on it
        // Test Validation
    }
}
