package codingPractice;

import static oct.ex_18102024_String_WrapperClass_ErrorHandelling_Arrays.Task.Task3_18102024_Palindrome.isPalindrome;

public class C_4_Palindrome_Checker {
    public static void main(String[] args) {
//        */////
//        Palindrome Checker Create a program that checks whether a given string is a palindrome. A palindrome is a word or phrase that reads the same backward as forward (ignoring spaces, punctuation, and capitalization).
//        Use an if-else statement to determine if the string is a palindrome. ////

        String inputString = "A man, a plan, a canal, PANAMA";
        if(isPalindrome(inputString))
        {
            System.out.println("\"" + inputString + "is a palindrome");
        }else {
            System.out.println("\"" + inputString + " is not a palindrome");
        }
    }
    public  static  boolean isPalindrome(String s)
    {
        String cleaned = s.replaceAll("[^a-zA-Z0-9]","").toLowerCase();
        String reversed = new StringBuilder(cleaned).reverse().toString();
        return reversed.equals(reversed);

    }
}
