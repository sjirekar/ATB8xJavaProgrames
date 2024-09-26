package sept.ex_18092024;

public class Lab057 {
    public static void main(String[] args) {
        int a = 10;
        System.out.println(a++ + ++a);
        System.out.println(a);
            //A -> a++ -> 10,a=11
            // +  -> operator
            // B -> ++a -> a =12 b -> 12
        //Line no | a | exp
        //5  | 10 |NA
        //6 |12|10+12

    }
}
