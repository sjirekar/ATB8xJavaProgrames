package oct.ex_21102024_Wrapper_Exception;

public class Lab174_Exceptions {
    public static void main(String[] args) {
        System.out.println("Start");
        int c = 10;
        try {
            c = 10 / c;
            String s1 = null;
            s1.trim();
            System.out.println(c);
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        }
        try {
            String s1 = null;
            s1.trim();
        } catch (NullPointerException e) {
            throw new RuntimeException(e);
        }

        System.out.println("End");
    }
}
