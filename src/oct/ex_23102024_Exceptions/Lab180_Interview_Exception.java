package oct.ex_23102024_Exceptions;

public class Lab180_Interview_Exception {
    public static void main(String[] args) {

        try {
            String s1 = "Pramod";
            String a1 = args[0];
            int a = 10 / 0;
            s1 = null;
            System.out.println(s1.trim());
        } catch (Exception e) {
            System.out.println("There is some problem with code");
            System.out.println(e.getMessage());
        }
        System.out.println("End of program");
    }
}
