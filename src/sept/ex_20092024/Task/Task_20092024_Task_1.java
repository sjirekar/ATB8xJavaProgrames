package sept.ex_20092024.Task;

public class Task_20092024_Task_1 {
    public static void main(String[] args) {
//        By using Ternary Operators max between 3 numbers.
//
//// Input int - a,b,c - a = 10, b = 20, c = 45
//
//// Max → a,b,c → c

        int a= 10, b= 20, c= 45;
        int max = a > b ? a : b;
        int max1 = b > c ? b : c;

        System.out.println(max);
        System.out.println(max1);
    }
}
