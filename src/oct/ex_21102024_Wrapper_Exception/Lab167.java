package oct.ex_21102024_Wrapper_Exception;

public class Lab167 {
    public static void main(String[] args) {
        //Primitive to wrapper
        int a = 10;
        Integer b=a; //Boxing - concept means wrapper is provided
        System.out.println(b);
        System.out.println(b.hashCode());
        System.out.println(Integer.MAX_VALUE);
        System.out.println(Integer.MIN_VALUE);

        Integer a2 = 42;
        int value = a2; //Unboxing ->concept means wrapper is removed  
        System.out.println(value);
    }
}
