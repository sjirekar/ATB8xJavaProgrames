package sept.ex_18092024;

public class Lab053 {
    public static void main(String[] args) {
        //Increment (++) //decrement (--) Operator
        //Pre and Post

        //pre - increment ++operand
        //value is incremented first and then stored in te result

        int a = 10;
        int b = ++a;
        //|a| output(b)|
        //10 on line 11
        //11 |11 on line 12
        System.out.println(b);
        System.out.println(a);

        //new ex:
        int c = 10;
        System.out.println(++c);
        System.out.println(c);

    // Post increment a++
    // Print first and then increase
        int d = 10;
        System.out.println(d++);
        System.out.println(d);


    }
}
