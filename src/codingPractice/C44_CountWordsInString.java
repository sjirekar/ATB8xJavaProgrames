package codingPractice;

public class C44_CountWordsInString{
    public static void main(String[] args) {
        String str = "Hello world! Welcome to Java.";
        String [] words = str.split("\\s+");
        System.out.println("The count of words is: " +words.length);

    }
}
