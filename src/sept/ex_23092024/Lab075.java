package sept.ex_23092024;

public class Lab075 {
    public static void main(String[] args) {
        //Switch statements
        //Syntax of switch (expression)
        //{
            //case statement 1;
            //code;
            //break;
        //case statement 2;
        //code;
        //break;
        //default statement;
        //code;
        //break;
        //}
        // days 1- 7 -> 1 Mond, 2 Tues etc
        int day = 1;
        switch (day)
        {
            case 1:
                System.out.println("Mon");
                break;
            case 2:
                System.out.println("Tue");
                break;
            case 3:
                System.out.println("Wed");
                break;
            case 4:
                System.out.println("Wed");
                break;
            case 5:
                System.out.println("Fri");
                break;
            case 6:
                System.out.println("Sat");
                break;
            case 7:
                System.out.println("Sun");
                break;
        }
        System.out.println("end of loop");

    }
}