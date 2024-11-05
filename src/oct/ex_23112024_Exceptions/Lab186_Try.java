package oct.ex_23112024_Exceptions;

public class Lab186_Try {
    public static void main(String[] args) {

        try {
            int c = 10 / 0;
        }
        catch (Exception e){
            throw new RuntimeException();
        }

        //if(condition) //never handle any exception

    }



}
