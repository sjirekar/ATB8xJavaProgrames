package oct.ex_23112024_Exceptions;

public class Lab176_Exception_Handel {
    public static void main(String[] args) {
        try {
            int a = 0;
            int c = 10 / a; //Arithmetic exception
            System.out.println(c);
        } catch (Exception e) {
            System.out.println(e.getMessage()); ////Arithmetic exception
            throw new ArithmeticException();
        } finally {
            System.out.println("I will be always executed");
        }
    }

}
