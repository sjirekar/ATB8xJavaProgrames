package sept.ex_23092024;

public class Lab090 {
    public static void main(String[] args) {
        char c = 'A';
        switch (c)
        {
            case 'A':
                System.out.println("A"); // duplicate value of A only so JVM will give error
                break;
            case 65:
                System.out.println("65");
                break;
        }
    }
}
