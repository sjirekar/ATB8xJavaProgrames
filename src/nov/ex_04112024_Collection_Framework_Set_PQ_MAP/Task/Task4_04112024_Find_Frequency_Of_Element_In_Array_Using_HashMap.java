package nov.ex_04112024_Collection_Framework_Set_PQ_MAP.Task;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Task4_04112024_Find_Frequency_Of_Element_In_Array_Using_HashMap {

//    Find the Frequency of Each Element in an Array ( Hashmap)
//
//    Integer[] numbers = {2, 2, 3, 4, 5, 5, 5, 3, 2, 4};   O/p 2→ 3 , 3 → 2 , 4→ 2,  5→ 3

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(2);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(5);
        list.add(5);
        list.add(3);
        list.add(4);
        list.add(4);

        HashMap<Integer, Integer> frequency_Map = new HashMap<>();
        for (Integer item : list) {
            frequency_Map.put(item, frequency_Map.getOrDefault(item, 0) + 1);
        }
        // Print the frequency map
        for (HashMap.Entry<Integer, Integer> entry : frequency_Map.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }

    }
}

