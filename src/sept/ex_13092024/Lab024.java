package sept.ex_13092024;

public class Lab024 {
    public static void main(String[] args) {
        //Literals
        //Boolean - Done
        //Integral - Done

        //Char

        //Single Char
        char c1 = 'A';
        char c2 = 'B';
        char c3 = '@';

        //Escape char
        char new_line = '\n';
        char tab_line = '\t';
        char back_space = '\b';
        char char_r = '\r';

        System.out.println("Suraj" + new_line + "Jirekar");
        System.out.println("Suraj" + '\n' + "Jirekar");  // ine 22 and 23 are same
        System.out.println("Suraj" + tab_line + "Jirekar");
        System.out.println("Suraj" + back_space + "Jirekar");
        System.out.println("Suraj" + char_r + "Jirekar");

        char c11 = 'A'; //65 ascii value of A

        char c12 = '\u1F60';
        System.out.println(c12);

    }
}
