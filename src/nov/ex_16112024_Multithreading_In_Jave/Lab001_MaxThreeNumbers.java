package nov.ex_16112024_Multithreading_In_Jave;

public class Lab001_MaxThreeNumbers {
    public static void main(String[] args) {
        //34, 54, 76 -> 76
        //4.2, 3.4, 1.2 ->  3.4
        //p, z, a -> z

        int maxPut = maximumNumberOf(34, 56, 76);
        System.out.println(maxPut);

        double maxPut1 = maximumNumberOf1(4.2, 3.4, 1.2);
        System.out.println(maxPut1);

        String maxPut2 = maximum("p", "z", "a" );
        System.out.println(maxPut2);

    }

    public  static  int maximumNumberOf (int a, int b, int c) {
        int max = a;
        if (b > max) {
            max = b;
        }
        if (c > max) {
            max = c;
        }
        return  max;


    }


    public  static  double maximumNumberOf1(double a, double b, double c) {
        double max1 = a;
        if (b > max1) {
            max1 = b;
        }
        if (c > max1) {
            max1 = c;
        }
        return max1;


    }

    public  static  String maximum(String x, String y, String z) {
        String max = x;
        if (y.compareTo(max) >0) {
            max = y;
        }
        if (z.compareTo(max) >0) {
            max = z;
        }
        return  max;


    }



}
