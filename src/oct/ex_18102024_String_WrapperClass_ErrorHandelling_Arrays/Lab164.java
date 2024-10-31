package oct.ex_18102024_String_WrapperClass_ErrorHandelling_Arrays;

public class Lab164 {
    public static void main(String[] args) {

        //String Immutability
        String str1 = "Hello";
        str1.concat("World"); //creates new string in SCP ->HelloWorld
        System.out.println(str1);
        //Store the concatenate string
        //str1 = str1.concat("World");
        // System.out.println(str1); //Will print HelloWorld
    }
}
