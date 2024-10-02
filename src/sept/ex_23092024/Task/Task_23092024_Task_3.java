package sept.ex_23092024.Task;

public class Task_23092024_Task_3 {
    public static void main(String[] args) {
        //         Write a program that converts between different units
        // (e.g., kilometers to miles, Celsius to Fahrenheit)
        // based on user selection using a switch statement.
        // Input. -
        // choice - 1 - km → m, km → 1km
        // choice - 2 - f → c, f → c
        int num = 20;
        int choice =1;

        switch (choice){
            case 1:
                System.out.println("converting km to km miles");
                System.out.println(num + "km" + " = "+ num * 06213 + "miles");
                break;

            case 2:
                System.out.println("converting Celsius to Fahrenheit");
                System.out.println(num+" C"+ " = " + (num * 9 / 5) + 32+" F");
                break;
            default:
                System.out.println("Invalid input");
                break;
        }
        }
}

