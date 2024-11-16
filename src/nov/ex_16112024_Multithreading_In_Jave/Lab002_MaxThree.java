package nov.ex_16112024_Multithreading_In_Jave;

public class Lab002_MaxThree {

    public static <DT extends Comparable<DT>> DT maximumOf(DT a, DT b, DT c) {
        //DT ->custom class created
        //Comparable - int, double, string
        DT max = a;
        if (b.compareTo(max) > 0) {
            max = b;

        }
        if (c.compareTo(max) > 0) {
            max = c;
        }
        return max;
    }

    public static void main(String[] args) {
        System.out.println(maximumOf(34, 54, 76));
        System.out.println(maximumOf(4.3, 3.4, 1.6));
        System.out.println(maximumOf("p", "z", "a"));

    }

}
