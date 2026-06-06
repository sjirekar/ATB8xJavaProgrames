package codingPractice;

public class C45_FirstLetterOfEachWord {
    public static void main(String[] args) {
        String str = "Hello Welcome To World Of Java";
        StringBuilder firstLetters = new StringBuilder();
        for(String word :str.split("\\s+"))
        {
            firstLetters.append(word.charAt(0));
        }
        System.out.println("First letter of each word: " +firstLetters.toString());
    }
}
