package oct.ex_25102024_Arrays.Task;

import java.util.Scanner;

public class Task2_25102024_Pyramid_Pattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the bum n=5");
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {

            for (int j = n - i; j > 1; j--) {
                System.out.print(" ");
            }
            for (int j = 0; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
