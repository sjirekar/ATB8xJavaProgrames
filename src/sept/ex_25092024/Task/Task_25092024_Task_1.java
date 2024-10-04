package sept.ex_25092024.Task;

import java.util.Scanner;

public interface Task_25092024_Task_1 {
    public static void main(String[] args) {
        // Table of number n = 10, print table with For or while.
        for (int i = 0; i <= 100; i++) {
            if (i % 10 == 0) {
                System.out.println("Number is divisible of 10: " + i);
            }
        }

        // Second Logic:
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number\n");
        int n = sc.nextInt();
        System.out.println("Mul of Table");
        for (int i = 1; i <= 10; i++) {
            System.out.println(n + "x" + i + "=" + (n * i));
        }
        // Third Logic
        int n1 = 10;
        int i = 1;
        System.out.println("Multiplication Tableof " + n +" using while loop");
        while(i<=10)
        {
            System.out.println(n1 + "x" + i + "=" + (n1 * i));
            i++;
        }

    }
}
