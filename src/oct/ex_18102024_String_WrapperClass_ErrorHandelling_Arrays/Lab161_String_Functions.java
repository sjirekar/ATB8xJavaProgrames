package oct.ex_18102024_String_WrapperClass_ErrorHandelling_Arrays;

public class Lab161_String_Functions {
    public static void main(String[] args) {
        String str = " Hello World ";
        String str1 = "Pramod";

        //Length of string
        System.out.println("Length: " + str.length()); //output 13
        System.out.println("Length: " + str1.length()); //output 6

        //Substring
        System.out.println("Substring: " + str.substring(1,5)); // start from 0th index til length-1 as here length 13 so starts from 0 to 12

        //Trim
        System.out.println("Trimmed: '" + str.trim() + "'");

        //Convert to uppercase
        System.out.println("Uppercase: " + str.toUpperCase());

        //Convert to lowercase
        System.out.println("Lowercase: " + str.toLowerCase());

        //Character at
        System.out.println(str.charAt(2));

        //checks equals to
        System.out.println(str.equals("Hello"));

        //Index of H
        System.out.println(str.indexOf("H"));

        //Contains
        System.out.println(str.contains("l"));
        System.out.println(str.contains("p"));

        //isEmpty
        System.out.println(str.isEmpty());

        //Split
        System.out.println(str.split(" "));

        //Compare to
        String name1 = "Pramod";
        String name2 = "Pramod";
        System.out.println(name1.compareTo(name2));
        //CompareTp -> 0 - Both of them are same
        //Return Number -> ASCII value diff - Between the Strings
        //diff bet d and D ->called as LEXICOGRAPHICALLY comparison
        String name3 = "Pramod";
        String name4 = "PramoD";
        System.out.println(name3.compareTo(name4));

        //Strip
        String nameStu = " P r a m o d ";
        System.out.println(nameStu.strip());
    }
}
