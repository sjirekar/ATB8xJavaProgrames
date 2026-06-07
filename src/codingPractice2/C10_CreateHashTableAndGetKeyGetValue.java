package codingPractice2;

import java.util.Hashtable;
import java.util.Map;

public class C10_CreateHashTableAndGetKeyGetValue {
    public static void main(String[] args) {
        Hashtable<Integer, String> hst = new Hashtable<>();
        hst.put(105,"Suraj");
        hst.put(107,"Nikita");
        hst.put(104,"Vaishnavi");
        hst.put(106,"Jirekar");

        for(Map.Entry m:hst.entrySet())
        {
            System.out.println(m.getKey() + " " + m.getValue());
        }
    }

}
