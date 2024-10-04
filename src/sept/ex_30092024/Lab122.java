package sept.ex_30092024;

public class Lab122 {
    public static void main(String[] args) {
        //1. Without Parameters and without return type
        function_Type1();
        //2. Without Parameters but with return type
        int age = function_Type2();
        System.out.println(age);
        // 3. With Parameters and without return type
        function_Type3("Suraj");
        //4. With Parameters and with return type
        int result = function_Type4(3, 4);
        System.out.println(result);
    }

    //Define
    //1. Without Parameters but with return type
    public static void function_Type1() {
        System.out.println("1. Without Parameters and without return type");
    }

    //2. Without Parameters but with return type
    public static int function_Type2() {
        System.out.println("2. Without Parameters but with return type");
        return 65;

    }

    //3. With Parameters and without return type
    public static void function_Type3(String name) {
        System.out.println("3. With Parameters and without return type");
        System.out.println("You have shared ->" + name);
    }

    //4. With Parameters and with return type
    public static int function_Type4(int a, int b) {
        System.out.println("4. With Parameters and with return type");
        return a+b;
    }
}
