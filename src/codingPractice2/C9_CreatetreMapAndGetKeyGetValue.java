package codingPractice2;

import java.util.Map;
import java.util.TreeMap;

public class C9_CreatetreMapAndGetKeyGetValue {
    public static void main(String[] args) {
        TreeMap<Integer, String> tm = new TreeMap<>();

        tm.put(101, "SJ");
        tm.put(103, "JS");
        tm.put(102, "SV");
        tm.put(104, "VS");

        for (Map.Entry m: tm.entrySet())
        {
            System.out.println(m.getKey() + " " + m.getValue());
        }
    }
}
