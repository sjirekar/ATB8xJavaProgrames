package codingPractice1;

import java.util.*;

public class C29_ListToSet {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>(Arrays.asList("Apple", "Banana", "Grapes"));
        Set<String> set = new HashSet<>(list);
        System.out.println("List is: " +list);
        System.out.println("Set is: " +set);
    }
}
