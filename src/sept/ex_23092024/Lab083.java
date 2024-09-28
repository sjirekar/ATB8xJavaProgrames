package sept.ex_23092024;

public class Lab083 {
    public static void main(String[] args) {
        int itemcode = 006;
        switch (itemcode)
        {
            case 001, 002, 005:
                System.out.println("All of them are  electronic gadget");
                break;
            case 004, 006, 007:
                System.out.println("All of them are Mech");
                break;
            default:
                System.out.println("None");
                break;
        }
    }
}
