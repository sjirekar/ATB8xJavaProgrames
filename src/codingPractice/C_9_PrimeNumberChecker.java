package codingPractice;

import java.util.Scanner;

public class C_9_PrimeNumberChecker {
    public static void main(String[] args) {
//        ✅Prime Number checker//

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int num = sc.nextInt();

        boolean isPrime = true;
        if (num<=1) {
            isPrime =false;

        }else{
            for (int i = 2; i < Math.sqrt(num); i++) {
                if (num%i == 0) {
                    isPrime =false;

                }
            }

        }
        if (isPrime) {
            System.out.println("The number " +num+" is a Prime");

        }else {
            System.out.println("The number " +num+" is a Prime");
        }
    }
}
