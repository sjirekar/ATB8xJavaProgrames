package oct.ex_21102024_Wrapper_Exception;

public class Lab168 {
    public static void main(String[] args) {
        String num = "10";
        //int a = num; //Non primitive to primitive :> not possible
        Integer a = Integer.valueOf(num);
        System.out.println(a);
        int a2 = a; //Unboxing

        //String to primitive
        int a3 = Integer.parseInt(num);

        //int a= 10; // These are not class or object
        //Whey we need Wrapper class:>
        //As we start Collection framework:_> We only user Class and Objects

    }
}
