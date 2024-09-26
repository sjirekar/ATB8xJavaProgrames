package sept.ex_18092024;

public class Lab051 {
    public static void main(String[] args) {
        long phone_no = 8080808080l;
        //short s = phone_no; //Narrowing: Implicit - JVM //Invalid
        short s1 = (short)phone_no;////Narrowing: Explicit - Loss //valid
    }
}
