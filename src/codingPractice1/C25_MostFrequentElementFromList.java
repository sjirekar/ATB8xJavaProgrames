package codingPractice1;

import java.util.*;

public class C25_MostFrequentElementFromList {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(Arrays.asList(1, 2, 2, 3, 3, 3, 4, 4, 4, 4));
        int mostFrequent = mostFrequentElement(list);
        System.out.println("Most Frequent element from list is: " + mostFrequent);
    }
    public static int mostFrequentElement(List<Integer> list)
    {
        Map<Integer, Integer> map = new HashMap<>();
        for(int num:list) {
            map.put(num,map.getOrDefault(num,0)+1);

        }
        return Collections.max(map.entrySet(),Map.Entry.comparingByValue()).getKey();
    }

}
