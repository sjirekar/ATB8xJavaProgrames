package codingPractice2;
import java.util.Scanner;

public class C16_PrimeNumber {
    public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);
       System.out.println("Enter the number: ");
       int number = scanner.nextInt();
       if(isPrime(number))
       {
           System.out.println("Number is Prime");
       }else {
           System.out.println("Number is Not Prime");
       }
    }
    static boolean isPrime(int num)
    {
        for (int i=2; i<=num/2;i++)
        {
            if(num%2==0)
            {
                return false;
            }
        }
        return true;
    }
}
