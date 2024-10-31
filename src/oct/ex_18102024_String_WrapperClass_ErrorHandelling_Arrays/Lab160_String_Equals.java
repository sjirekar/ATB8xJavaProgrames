package oct.ex_18102024_String_WrapperClass_ErrorHandelling_Arrays;

public class Lab160_String_Equals {
    public static void main(String[] args) {
        String s1 = "Hello"; //SCP
        String s4 = "Hello"; //SCP
        String s2 = new String("Hello"); //Object Area
        String s3 = new String("Hello"); //Object Area
        String s5 = new String("hello"); //Object Area

        System.out.println(s1 == s2); //false
        System.out.println(s2 == s3); //false
        System.out.println(s1 == s4); //true
        //== :>This is basically checking the reference loc in case of String and checks for vaue in case of int

        //How can i check the values :> //'equals' checks for values or sequence of values
        System.out.println(s1.equals(s2)); // True
        System.out.println(s2.equals(s3)); // True
        System.out.println(s2.equals(s3)); // True
        System.out.println(s3.equals(s5)); // false: bcoz case sensitivity while checking sequence
        System.out.println(s3.equalsIgnoreCase(s5)); // true: bcoz case sensitivity is ignored now while checking sequence


    }
}
