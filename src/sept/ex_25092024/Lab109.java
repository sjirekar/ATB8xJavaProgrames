package sept.ex_25092024;

public class Lab109 {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            System.out.println(i);
        }
        System.out.println(" ----");
        for (int i = 0; i < 10; ++i) {
            System.out.println(i);
        }
        System.out.println(" ----");
        for (char i = 'A'; i <= 'Z'; i++) {
            if(i=='P')
            {
                break;
            }
            System.out.println(i);
        }
    }
}
