package sept.ex_20092024;

public class Lab074 {
    public static void main(String[] args) {
        //Grade Calculator
        //Writ a program that calculates and displays
        //the letter grade for given numerical
        //score (ex: A, B, C, D, or F)
        // A: 90-100
        // B: 80-89
        // C: 70-79
        // D: 60-69
        // F: 0-59

        // 1. Find the input
        // score -> int score = 89;
        //return ->data - type - grade -> char

        // 2. Basic logic
        //if score >= 90 && <=100 -> A
        //else if score <= 89 && <=80 -> B
        //else if score <= 89 && >=80 -> B
        //etc till F

        // 3. Write the code
        char grade = 'F';
        int score = 89;

        if (score >= 90 && score <=100)
        {
            grade = 'A';
        } else if (score >= 80 && score <=89) {
            grade = 'B';
        }
        else if (score >= 70 && score <=79) {
            grade = 'C';
        }
        else if (score >= 60 && score <=69) {
            grade = 'D';
        }
        else if(score <= 0 || score >100) {
            System.out.println("Lol !!, are you god");
            grade = 'O';
        }
        else {
            grade = 'F';
        }
        System.out.println("Your grade is ->" + grade);


    }
}
