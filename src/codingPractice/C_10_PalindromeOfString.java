package codingPractice;

public class C_10_PalindromeOfString {
    public static void main(String[] args) {
        //✅Palidrome of String//
        String input = "Madam";
        if (isPalindrome(input))
        {
            System.out.println("The given string is palindrome");
        }
        else {
            System.out.println("The given string is not a palindrome");
        }

    }
    public  static  boolean isPalindrome(String str){
        str = str.toLowerCase();

        for (int i = 0; i < str.length()/2; i++) {

            char start = str.charAt(i);
            char end = str.charAt(str.length()-1-i);
            if (start != end) {
                return  false;
            }

        }
        return true;
    }
}
