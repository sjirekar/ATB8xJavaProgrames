package codingPractice2;

import java.util.HashMap;
import java.util.Map;

public class C7_CreateHashMapAndGetKeyGetValue {
    public static void main(String[] args) {
        Map<Integer, String> map = new HashMap<Integer,String>();

        map.put(100,"Suraj");
        map.put(200, "Jirekar");
        map.put(300,"John");
        map.put(400, "Wick");

        for (Map.Entry m : map.entrySet())
        {
            System.out.println(m.getKey() + " " + m.getValue());
        }
    }
}
