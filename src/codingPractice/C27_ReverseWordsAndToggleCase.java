package codingPractice;

public class C27_ReverseWordsAndToggleCase {
    public static void main(String[] args) {
        String input = "My Name Is Suraj";
        String [] words = input.split(" ");
        StringBuilder result = new StringBuilder();
        for(int i=words.length-1;i>=0; i--)
        {
            StringBuilder swapped = new StringBuilder();
            for (char ch : words[i].toCharArray())
            {
                if(Character.isUpperCase(ch))
                {
                    swapped.append(Character.toLowerCase(ch));
                }
                else {
                    swapped.append(Character.toUpperCase(ch));
                }
            }
            result.append(swapped);
            if(i>0)
            {
                result.append(" ");
            }
        }
        System.out.println(result);

    }
}
