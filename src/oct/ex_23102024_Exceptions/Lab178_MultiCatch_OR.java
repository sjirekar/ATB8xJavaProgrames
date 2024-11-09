package oct.ex_23102024_Exceptions;

public class Lab178_MultiCatch_OR {
    public static void main(String[] args) {
        int b = 0; //ArithmeticException
        try {
            String ip = args[0]; //ArrayIndexOutOfBoundsException
            int a = Integer.parseInt(ip); //NumberFormatException
            b = 1000 / a;
        } catch (ArithmeticException | NumberFormatException | ArrayIndexOutOfBoundsException e) {
            System.out.println(e.getMessage());
        }
        catch (Throwable e){
            System.out.println(e.getMessage());
        }
//        catch (Object e){ //Can't be used
//            System.out.println(e.getMessage());
//        }

    }
}
