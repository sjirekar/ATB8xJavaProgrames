package sept.ex_20092024.Task;

import java.util.Scanner;

public class Task_20092024_Task_4 {
    public static void main(String[] args) {
//        FizzBuzz Test:
//
//        Write a program that prints numbers from 1 to 100.
//        However, for multiples of 3, print "Fizz" instead of the number,
//        and for multiples of 5, print "Buzz."
//        For numbers that are multiples of both 3 and 5,
//        print "FizzBuzz."

// Logic ->
        //Step 1 ->
        //Input -> int n -> n=100 - Using scanner class
        //output ->  String -> Fizz, buz, FizBuzz -> SOP

        //Step 2
        //Rough logic
        //for -> int i 1 to i<100 (n)
        // i ->multiple of 3-> modulus - i%3 -> Fizz
        // i ->multiple of 5-> modulus - i%5 -> Buzz
        // i ->multiple of 5-> modulus - i%3 && i%5 -> FizzBuzz

        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number n = 100");
        for (int i = 1; i <= 100; i++) {
          if(i%3==0 && i%5==0)
          {
              System.out.println("FizzBuzz");
          } else if (i%5==0) {
              System.out.println("Buzz");
          } else if (i%3==0) {
              System.out.println("Fizz");
          }
          else {
              System.out.println(i);
          }
        }

    }
}
