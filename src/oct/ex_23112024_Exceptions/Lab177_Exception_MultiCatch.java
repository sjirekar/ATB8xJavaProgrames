package oct.ex_23112024_Exceptions;

public class Lab177_Exception_MultiCatch {
    public static void main(String[] args) {
//        int b = 0;
        try {
            String ip = args[0]; //java.lang.ArrayIndexOutOfBoundsException
            int a = Integer.parseInt(ip); //NumberFormatException
            int b = 100 / a; //ArithmeticException
            System.out.println(b);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println(e.getMessage());
        } catch (NumberFormatException e) {
            System.out.println(e.getMessage());
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        } finally {
            System.out.println("End");
        }

    }
}
