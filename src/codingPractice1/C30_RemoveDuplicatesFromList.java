package codingPractice1;

import java.util.*;

public class C30_RemoveDuplicatesFromList {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>(Arrays.asList("apple","banana","orange","apple"));
        Set<String> set = new HashSet<>(list);
        list.clear();
        list.addAll(set);
        System.out.println("Removed Duplicate Items list is: " +list);
    }
}
