package sept.ex_30092024;

public class Lab121 {
    public static void main(String[] args) {
        greet();
        greet();
        //we can use it mutiple time using loop also
        for (int i = 0; i < 100; i++) {
            greet();

        }
    }

    public static void functionName() {
        System.out.println("This is VOID function");
    }

    //Define
    //1. No Return Type and No Argument
    public static void greet() {
        System.out.println("Hi");
    }
}
