package sept.ex_27092024.Task;

public class Task_27092024_Task_2 {
    public static void main(String[] args) {
//        Create a Java program that prints the first 5 even numbers using a do-while loop.

        int count =0;
        int number =1;
        while (count<=5)
        {
            if (number%2==0)
            {
                System.out.println(number);
                count++;
            }
            number++;
        }
    }
}
