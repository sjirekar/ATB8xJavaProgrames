package codingPractice;

import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class C_19_IterateThroughLinkedList {
    public static void main(String[] args) {
        List<String> list = new LinkedList<>(Arrays.asList("A","B","C","D"));
        Iterator<String> iterator = list.iterator();
        ///using iterator
        while(iterator.hasNext())
        {
            System.out.println(iterator.next());
        }
        ///using enhanced for loop
        for(String item : list)
        {
            System.out.println(item);
        }
        ///using for loop
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
    }
}
