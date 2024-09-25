package sept.ex_16092024;

public class Lab038_Relational_Operator {
    public static void main(String[] args) {
        //Relational Operators
        // > , < , >= , <=, !=, !   --->> they always return true or false
        int a = 10;
        int b = 30;

        boolean c = a>b;
        System.out.println(c);

        int age_mamitha = 35;
        int age_suraj = 35;
        ////boolean result = age_mamitha > age_suraj; //false
        boolean result = age_mamitha >= age_suraj; // age_mamitha > age_suraj or age_mamitha = age_suraj
        System.out.println(result);

    }
}
