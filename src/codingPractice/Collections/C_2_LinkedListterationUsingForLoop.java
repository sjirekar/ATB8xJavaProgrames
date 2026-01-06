package codingPractice.Collections;

import java.util.LinkedList;

public class C_2_LinkedListterationUsingForLoop {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();
        list.add("Apple");
        list.add("Banana");
        list.add("Carrot");
        for(int i =0; i<list.size(); i++)
        {
           String ele = list.get(i);
            System.out.println(ele);
        }
    }
}
