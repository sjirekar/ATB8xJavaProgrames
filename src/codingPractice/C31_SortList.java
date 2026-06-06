package codingPractice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class C31_SortList {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>(Arrays.asList("orange", "apple", "banana","grapes"));
        List<Integer> list1 = new ArrayList<>(Arrays.asList(7, 2, 9, 1, 10, 4, 6, 3, 8, 5));

        Collections.sort(list);
        System.out.println(list);

        Collections.sort(list1);
        System.out.println(list1);
    }
}
