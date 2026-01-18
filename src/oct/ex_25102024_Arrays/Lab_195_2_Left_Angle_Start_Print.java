package oct.ex_25102024_Arrays;

import java.util.Scanner;

public class Lab_195_2_Left_Angle_Start_Print {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the input num n = 5");
        int n = sc.nextInt();

        for (int i = n; i > 0 ; i--) {
            for (int j = 0; j < i; j++) {
                System.out.print("* ");
            }

            System.out.println();
        }
    }
}
