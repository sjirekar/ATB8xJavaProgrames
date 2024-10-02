package sept.ex_20092024.Task;

public class Task_20092024_Task_2 {
    public static void main(String[] args) {
//        Ternary Operators to handle multiple conditions.
//
//// Input → int score = 85
//
//// String grade →
//
////  score >= 90 → A
////  score >= 80 → B
////  score >= 70 → C

        int score = 85;
        String grade = score >= 90 ? "A" : "Grade is less";
        String grade1 = score >= 80 ? "B" : "Grade is less";
        String grade2 = score >= 70 ? "C" : "Grade is less";
        System.out.println(grade);
        System.out.println(grade1);
        System.out.println(grade2);
    }
}
