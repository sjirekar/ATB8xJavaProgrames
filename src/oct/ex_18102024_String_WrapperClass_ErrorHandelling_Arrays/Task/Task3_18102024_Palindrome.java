package oct.ex_18102024_String_WrapperClass_ErrorHandelling_Arrays.Task;

import java.util.Scanner;

//Palindrome Input : str = "abba"
//Output: Yes
//
//Input : str = "pramod"
//Output: No
public class Task3_18102024_Palindrome {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String str = scanner.nextLine();

        if (isPalindrome(str)) {
            System.out.println("Output: Yes");
        } else {
            System.out.println("Output: No");
        }

        scanner.close();
    }

    public static boolean isPalindrome(String str) {
        int length = str.length();
        for (int i = 0; i < length / 2; i++) {
            if (str.charAt(i) != str.charAt(length - 1 - i)) {
                return false;
            }
        }
        return true;

    }
}
