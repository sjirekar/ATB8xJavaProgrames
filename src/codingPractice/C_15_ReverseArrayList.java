package codingPractice;

import java.util.*;

public class C_15_ReverseArrayList {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(Arrays.asList(1,2,3,4,5));
        Collections.reverse(list);
        System.out.println("Reversed String is: " +list);
    }
}
