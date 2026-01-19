package oct.ex_28102024_CollectionFramework;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Collection_List_ArrayList_Practice {
    public static void main(String[] args) {
        List list = new ArrayList();
        list.add(100);
        list.add(140);
        list.add(110);
        list.add(130);
        list.add(120);
        list.add(140);
        list.add(140);
        System.out.println(list);
        System.out.println(list.get(3));
        System.out.println(list.size());
        System.out.println(list.lastIndexOf(140));
        System.out.println(list.contains(130));
        System.out.println(list.getFirst());
        System.out.println(list.getLast());

        Collections.sort(list);
        System.out.println(list);
        Collections.sort(list,Collections.reverseOrder());
        System.out.println(list);

    }
}
