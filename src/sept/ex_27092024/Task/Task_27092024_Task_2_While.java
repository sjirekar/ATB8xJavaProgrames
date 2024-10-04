package sept.ex_27092024.Task;

public class Task_27092024_Task_2_While {
    public static void main(String[] args) {
//        Create a Java program that prints the first 5 even numbers using a do-while loop.
//do while logic
        int count =0;
        int number = 2;
        do{
            System.out.println(number);
            number +=2;
            count++;
        }
        while (count<5);
    }
}
