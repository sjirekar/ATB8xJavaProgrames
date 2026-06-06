package codingPractice;

import java.util.*;

public class C28_ListIntersection {
    public static void main(String[] args) {
        List<Integer> list1 = new ArrayList<>(Arrays.asList(1,2,3,4,5));
        List<Integer> list2 = new ArrayList<>(Arrays.asList(4,5,6,7,8));

        List<Integer> intersection = intersectionList(list1,list2);
        System.out.println("The intersection of two list is : " + intersection);

    }

    public static List<Integer> intersectionList(List<Integer>list1,List<Integer>list2)
    {
        Set<Integer> set1 = new HashSet<>(list1);
        Set<Integer> set2 = new HashSet<>(list2);
        set1.retainAll(set2);
        return new ArrayList<>(set1);
    }

}
