package oct.ex_30102024_Collections_Framework_Set;

import java.util.*;

public class Lab_209_Set_HS_LHS_TS {
    public static void main(String[] args) {
        //List -> Duplicates allowed
        //Set -> Duplicates are not allowed

        System.out.println("**********/HashSet/*************");

        Set hs = new HashSet(); //Hashing mechanism to store the element, no order will be maintained
        hs.add("Apple");
        hs.add("Orange");
        hs.add("Watermelon");
        hs.add("Watermelon");
        hs.add(null);
        System.out.println(hs);

        System.out.println("**********/LinkedHashSet/*************");

        Set lhs = new LinkedHashSet(); //LinkedList mechanism to store the element, order will be maintained
        lhs.add("Apple");
        lhs.add("Orange");
        lhs.add("Watermelon");
        lhs.add(null);
        System.out.println(lhs);

        System.out.println("**Ex of LinkedHashSet Function Which are all same**");
        System.out.println(lhs.isEmpty());
        System.out.println(lhs.contains("Apple"));
        System.out.println(lhs.size());

        System.out.println("**********/TreeSet/*************");

        Set ts = new TreeSet(); //Black and Red Tree mechanism to store the element,
        /* order will be maintained, Natural storing is done */
        ts.add("Dapple");
        ts.add("Apple");
        ts.add("Orange");
        ts.add("Orange");
        //ts.add(123); java.lang.ClassCastException ->exception is trwon as different data types are not compared for sorting
        //Means data types need to be same in TreeSet for sorting and maintaining order
        ts.add("Watermelon");
        ////ts.add(null); java.lang.NullPointerException -> Since TreeSet is using sorting and maintaining order we are not allowed null
        System.out.println(ts);

        System.out.println("***/Using for loop/**");

        for (Object o : ts) {
            System.out.println(o);
        }

        System.out.println("***/Using Iterator/**");

        Iterator it = ts.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }


    }
}
