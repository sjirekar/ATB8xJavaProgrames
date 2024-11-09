package oct.ex_28102024_CollectionFramework;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Lab200_List_ArrayList_ForLoop {
    public static void main(String[] args) {
        List list = new ArrayList<>(); //dynamic dispatch
        list.add("bread");
        list.add("milk");
        list.add("butter");
        list.add("paneer");
        list.add("jam");
        list.add("cheese");
        System.out.println(list);
        System.out.println(list.size());
        //System.out.println(list.contains(1)); //false
        System.out.println(list.contains("milk"));
        System.out.println(list.isEmpty());
        System.out.println(list.indexOf("butter")); //finds the first index of element
        System.out.println(list.indexOf("jam"));
        System.out.println(list.lastIndexOf("paneer"));

        System.out.println("------------------Default for loop-");
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }

        System.out.println("------------------For each loop-");
        for (Object o :list) {
            System.out.println(o);
        }
    }
}
