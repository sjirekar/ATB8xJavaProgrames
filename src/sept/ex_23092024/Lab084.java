package sept.ex_23092024;

public class Lab084 {
    public static void main(String[] args) {
        int itemcode = 001;
        switch (itemcode) {
            case 001 -> System.out.println("It s laptop");
            case 002 -> System.out.println("It s desktop");
            case 003, 004 -> System.out.println("It s Mobile");
            default -> System.out.println("Hello");
        }
    }
}
