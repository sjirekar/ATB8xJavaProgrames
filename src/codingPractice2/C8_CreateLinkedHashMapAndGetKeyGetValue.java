package codingPractice2;

import java.util.LinkedHashMap;
import java.util.Map;

public class C8_CreateLinkedHashMapAndGetKeyGetValue {
    public static void main(String[] args) {
        LinkedHashMap<String, Integer> lhm = new LinkedHashMap<>();
        lhm.put("John", 100);
        lhm.put("Wick", 200);
        lhm.put("Suraj", 300);
        lhm.put("Nikita", 400);

        for (Map.Entry m : lhm.entrySet())
        {
            System.out.println(m.getKey() + "-->" + " " + m.getValue());
        }

    }
}
