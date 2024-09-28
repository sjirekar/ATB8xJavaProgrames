package sept.ex_23092024;

public class Lab078 {
    public static void main(String[] args) {

        int day = 5;
        switch (day)
        {
            case 1:
                System.out.println("Mon");
            case 2:
                System.out.println("Tue");
            case 3:
                System.out.println("Wed");
            case 4:
                System.out.println("Wed");
            case 5:
                System.out.println("Fri");
            case 6:
                System.out.println("Sat");
            case 7:
                System.out.println("Sun");
            default:
                System.out.println("No idea what day it is: ");
        }
        System.out.println("end of loop");

    }
}