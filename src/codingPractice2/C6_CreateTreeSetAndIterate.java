package codingPractice2;

import java.util.Iterator;
import java.util.TreeSet;

public class C6_CreateTreeSetAndIterate {
    public static void main(String[] args) {
        TreeSet<String> set = new TreeSet<>();

        set.add("John");
        set.add("Wick");
        set.add("Keanu");
        set.add("Reeves");

        Iterator<String> itr = set.iterator();
        while(itr.hasNext())
        {
            System.out.println(itr.next());
        }
    }
}
