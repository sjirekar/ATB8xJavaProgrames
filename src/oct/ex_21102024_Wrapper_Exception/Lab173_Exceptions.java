package oct.ex_21102024_Wrapper_Exception;

public class Lab173_Exceptions {
    public static void main(String[] args) {

       //Unchecked exception -> java.lang.NullPointerException
        //jvm - at the runtime ->Terminated the programs
        System.out.println("Start");
        String s1 = null;
        System.out.println(s1.trim());
        System.out.println("End");
    }
}
