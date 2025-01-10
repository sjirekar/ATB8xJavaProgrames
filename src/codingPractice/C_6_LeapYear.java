package codingPractice;

public class C_6_LeapYear {
    public static void main(String[] args) {
        ///Leap Year Checker: Create a program that determines whether a given year is a leap year.
        //A leap year is divisible by 4, but not by 100 unless it is also divisible by 400. Use an if-else statement to make this determination.
        int year = 2400;
        boolean isLeapYear = false;
        if (year % 4 == 0 && year % 100 == 0 || year % 400 ==0) {
            isLeapYear = true;
        }
        if (isLeapYear) {
            System.out.println(year + " is a leap year");
        }else {
            System.out.println(year + " is not a leap year");
        }
    }
}
