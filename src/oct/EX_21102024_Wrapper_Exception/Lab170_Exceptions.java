package oct.EX_21102024_Wrapper_Exception;

public class Lab170_Exceptions {
    public static void main(String[] args) {
        System.out.println("Start of the program");
        //This code will create array index out of index exception
//        String ip = args[0]; //10
//        String ip1 = args[1]; //20
//        String ip2 = args[2]; //30
//        String ip3 = args[3]; //ArrayIndexOutOfBoundsException
//        System.out.println(ip);
//        System.out.println(ip1);
//        System.out.println(ip2);

        String s = args[0]; //10 ArrayIndexOutOfBoundsException
        int a = Integer.parseInt(s); //10 //NumberFormatException
        int b = 1000 / a; //ArrayIndexOutOfBoundsException
        System.out.println(b);
        System.out.println("End of the Program");

        //JVM wil be initialized (From RAM)
        //Create and starts the main Thread - Main Called
        //1)Collects the CLI Arguments
        //String[] args = {10}
        //Lab170_Exception.main()
        //Now Control will be transferred from mian Thread to Main Method
        //When problem comes JVM wil handels it
        //If you don't hande the exception JVM will handle it
        //JVM will always terminate the program -> In any exception


    }
}
