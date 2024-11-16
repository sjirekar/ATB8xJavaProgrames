package nov.ex_04112024_Collection_Framework_Set_PQ_MAP;

import java.util.Enumeration;
import java.util.HashMap;
import java.util.Hashtable;

public class Lab215_HasTable {
    public static void main(String[] args) {
        //Map -> 1 null is allowed

        //HashTable->
        //Synchronize
        //Slow
        //Legacy
        Hashtable<Integer, String> ht1 = new Hashtable<>();
        ht1.put(1, "one");
        ht1.put(2, "two");
        ht1.put(3, "three");
        //ht1.put(4,null); java.lang.NullPointerException -> give exception as not allowed
        System.out.println(ht1);

        HashMap<Integer, String> ht2 = new HashMap<>();
        ht2.put(1, "one");
        ht2.put(2, "two");
        ht2.put(3, "three");
        ht2.put(4, null); //Allowed
        System.out.println(ht2);

        //Iterate -> Use Enumeration
        Enumeration<Integer> e = ht1.keys();
        while (e.hasMoreElements()) {
            ////System.out.println(e.nextElement()); //getting keys
            System.out.println(ht1.get(e.nextElement()));
        }
    }
}
