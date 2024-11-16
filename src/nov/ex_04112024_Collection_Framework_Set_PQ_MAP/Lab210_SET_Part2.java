package nov.ex_04112024_Collection_Framework_Set_PQ_MAP;

import java.util.ArrayList;
import java.util.HashSet;

public class Lab210_SET_Part2 {
    public static void main(String[] args) {
        HashSet<String> set = new HashSet<>();
        set.add("Apple");
        set.add("Banana");
        set.add("Orange");
        set.add("Apple"); ////Set does not use indexing mechanics to store the elements, so few index functions/methods are not available
        System.out.println("Set elements:" + set);


        ArrayList list = new ArrayList();
        //list.add(); //index -> array use index to store
        //add, replace, contains, remove


    }
}
