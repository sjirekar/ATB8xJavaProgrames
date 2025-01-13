package codingPractice;

public class C_14CountVowelsAndConsonantInAString {
    public static void main(String[] args) {
       String str = "Hello World";
       int vowelsCount = 0;
       int consonantCount = 0;
       str = str.toLowerCase();
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch>='a' && ch<='z') {
                if (ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u')
                {
                    vowelsCount++;
                }else {
                    consonantCount++;
                }

            }

        }
        System.out.println("The number of vowels is: " +vowelsCount);
        System.out.println("The number of consonant is: " +consonantCount);
    }

}
