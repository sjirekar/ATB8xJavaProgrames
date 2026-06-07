package codingPractice1;

import java.util.HashMap;
import java.util.Map;

public class C32_IterateMap {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();
        map.put("apple", 1);
        map.put("banana", 2);
        map.put("orange", 3);

        for(Map.Entry<String,Integer> entry : map.entrySet())
        {
            System.out.println(entry.getKey() + ":" + entry.getValue());
        }
    }


}
