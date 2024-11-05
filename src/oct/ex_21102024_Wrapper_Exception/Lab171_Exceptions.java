package oct.ex_21102024_Wrapper_Exception;

public class Lab171_Exceptions {
    public static void main(String[] args) {

        //Checked - JVM Knows
       //FileInputStream file = new FileInputStream("C://a.txt");
        //JVM ow this tht file may not exist

        //Unchecked exception - AithmaticException
        int a =10;
        int c= a/0;
        System.out.println(c);

    }
}
