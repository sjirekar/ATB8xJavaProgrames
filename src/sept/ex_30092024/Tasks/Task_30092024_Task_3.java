package sept.ex_30092024.Tasks;

public interface Task_30092024_Task_3 {
    public static void main(String[] args) {
//      Count vowels and consonants in a String. (pramod) - v = 2 , c =. 4
        int vowelCount = 0, consonantCount = 0;


        String str = "pramod";

        for(int i = 0; i < str.length(); i++) {

            if(str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'i' || str.charAt(i) == 'o' || str.charAt(i) == 'u') {

                vowelCount++;
            }

            else if(str.charAt(i) >= 'a' && str.charAt(i)<='z') {
                consonantCount++;
            }
        }
        System.out.println("Number of vowels: " + vowelCount);
        System.out.println("Number of consonants: " + consonantCount);
    }
}


