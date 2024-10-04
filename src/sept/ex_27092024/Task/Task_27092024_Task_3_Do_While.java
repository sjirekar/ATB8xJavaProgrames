package sept.ex_27092024.Task;

public class Task_27092024_Task_3_Do_While {
    public static void main(String[] args) {
        //Write a Java program that calculates the sum of numbers from 1 to 100 using a while loop.
        // Calculate the Sum of numbers 1 to 100;
       //Working with while loop
        int sum =0;
        int i =1;
        do{
            sum += i;
            i++;
        }
        while (i<=100);
        System.out.println("Sum of numbers from 1 to 100 is: " + sum);

    }
}
