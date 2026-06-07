package codingPractice2;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class C5_CreateLinkedHashSetAndIterate {
    public static void main(String[] args) {
        LinkedHashSet<String> set = new LinkedHashSet<>();
        set.add("SJ");
        set.add("VS");
        set.add("SV");
        set.add("BS");

        Iterator<String> itr = set.iterator();
        while (itr.hasNext())
        {
            System.out.println(itr.next());
        }
    }
}
