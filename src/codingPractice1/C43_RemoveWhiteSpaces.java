package codingPractice1;

public class C43_RemoveWhiteSpaces{
    public static void main(String[] args) {
        String str = " Geeks for Geeks ";
        str = str.replaceAll("\\s","");
        System.out.println("String with removed white spaces: " +str);
    }
}
