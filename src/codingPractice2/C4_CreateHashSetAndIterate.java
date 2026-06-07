package codingPractice2;

import java.util.HashSet;
import java.util.Iterator;

public class C4_CreateHashSetAndIterate {
    public static void main(String[] args) {
        HashSet<String> set = new HashSet<>();
        set.add("Suraj");
        set.add("VS");
        set.add("Nikita");

        Iterator<String> itr = set.iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }
    }
}
