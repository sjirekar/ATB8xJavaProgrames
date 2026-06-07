package codingPractice1;

import java.util.HashSet;

public class C34_DuplicateElementsUsingHashSet {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5, 1, 2};
        HashSet<Integer> set = new HashSet<>();
        HashSet<Integer> duplicates = new HashSet<>();
        for(int number : numbers)
        {
            if(!set.add(number))
            {
                duplicates.add(number);
            }
        }
        System.out.println("Duplicate elements in set format are: " + duplicates);

    }
}
