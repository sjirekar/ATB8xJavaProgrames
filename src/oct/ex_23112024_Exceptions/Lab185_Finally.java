package oct.ex_23112024_Exceptions;

public class Lab185_Finally {
    public static void main(String[] args) {
        try {
            int c = 10/0;
        } catch (Exception e) {
            throw new RuntimeException(e);
        } finally {
            System.out.println("");
        }
//        finally {
//            System.out.println("");
//        }


    }
}
