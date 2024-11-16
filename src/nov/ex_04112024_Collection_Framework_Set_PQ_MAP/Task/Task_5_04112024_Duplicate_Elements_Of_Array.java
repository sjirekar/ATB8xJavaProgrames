package nov.ex_04112024_Collection_Framework_Set_PQ_MAP.Task;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Task_5_04112024_Duplicate_Elements_Of_Array {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5, 1, 2};
        List<Integer> duplicates = findDuplicates(numbers);
        System.out.println(duplicates);
    }

    public static List<Integer> findDuplicates(int[] numbers) {
        Set<Integer> set = new HashSet<>();
        List<Integer> duplicates = new ArrayList<>();
        for (int number : numbers) {
            if (!set.add(number)) {
                // If the number is already in the set, it's a duplicate i
                if (!duplicates.contains(number)) {
                    duplicates.add(number);
                }
            }
        }
        return duplicates;
    }
}
