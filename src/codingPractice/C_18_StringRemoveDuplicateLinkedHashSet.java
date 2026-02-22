package codingPractice;

import java.util.LinkedHashSet;

public class C_18_StringRemoveDuplicateLinkedHashSet {
    public static void main(String[] args) {
        String input = "Hello World";
        String output = remove(input);
        System.out.println("The removed duplicate String is: " +output);

    }
    public static  String remove(String str){
        LinkedHashSet<Character> set = new LinkedHashSet<>();
        for (int i = 0; i < str.length(); i++) {
            set.add(str.charAt(i));

        }
        StringBuilder result = new StringBuilder();
        for(char ch: set)
        {
            result.append(ch);
        }
        return result.toString()
;    }

}
