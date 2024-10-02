package sept.ex_25092024;

import javax.xml.transform.Source;
import java.util.Scanner;

public class Lab114 {
    public static void main(String[] args) {
        //How to take user input

        Scanner sc = new Scanner(System.in); // New object
        System.out.println("Enter the number");
        int num = sc.nextInt();
        System.out.println(num);

        System.out.println("Enter the string");

        String name = sc.next();
        System.out.println(name);


    }
}
