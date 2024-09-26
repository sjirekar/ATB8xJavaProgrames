package sept.ex_18092024;

public class Lab050 {
    public static void main(String[] args) {
        //Type casting
        //Widening - Implicit, explicit -lossless
        //narrowing - Implicit, explicit(with data type) - loss

        //Widening
        byte b = 10;
        int a = b; //Valid - Implicit casting - JVM
        int a1 = (int)b;  //Valid - Explicit casting - JVM

        //Narrowing
        int val = 300;
        //byte b1 = val; //Invalid Implicit casting
        byte b2 = (byte)val; //Valid Explicit casting --Loss of data
        System.out.println(b2);


    }
}
