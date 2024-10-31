package oct.ex_18102024_String_WrapperClass_ErrorHandelling_Arrays.Task;

//Reverse the String without using  any functions. (for loop)
public class Task2_18102024_ReverseString_WithoutAnyFunctionUse {
    public static void main(String[] args) {
        String name = "suraj";
        String reverse = "";
        char ch;

        for (int i = 0; i < name.length(); i++) {

            ch = name.charAt(i);
            reverse = ch + reverse;
        }
        System.out.println("Reverse string is: " + reverse);
    }
}
