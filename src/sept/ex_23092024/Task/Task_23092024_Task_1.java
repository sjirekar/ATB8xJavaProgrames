package sept.ex_23092024.Task;

public class Task_23092024_Task_1 {
    public static void main(String[] args) {
        int num1=10, num2=20;
        String s = "+";
        switch (s)      {
            case "+":
                System.out.println(num1 + num2);
                break;
            case "-":
                System.out.println(num1 - num2);
                break;
            case "*":
                System.out.println(num1 * num2);
                break;
            case "/":
                System.out.println(num1 / num2);
                break;
            case "%":
                System.out.println(num1 / num2);
                break;
            default:
                System.out.println("Default case");
                break;
        }
    }
}
