package oct.ex_23112024_Exceptions;

public class Lab181_Interview_Exception_2 {
    public static void main(String[] args) {
        final double pi = 3.14;
        int a = 0;
        try{
            int x = 10/a;
        }
        catch (Exception e){
            System.out.println("Div by zero");
        }
        finally {
            System.out.println("I will be executed anyhow");
        }
    }
}
