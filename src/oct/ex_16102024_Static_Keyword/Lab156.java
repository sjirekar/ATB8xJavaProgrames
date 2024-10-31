package oct.ex_16102024_Static_Keyword;

public class Lab156 {
    public static void main(String[] args) {
        //ENUM -> Is is Data type
        System.out.println(Day.MONDAY);
        System.out.println(Day.SUNDAY);
    }
}

enum Day{
    SUNDAY, MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FIRDAY, SATURDAY
}
