package nov.ex_04112024_Collection_Framework_Set_PQ_MAP.Task;

import java.util.ArrayList;
import java.util.List;

public class Task3_04112024_Reverse_ArrayList {
    public static void main(String[] args) {
        List list = new ArrayList();
        list.add("sj");
        list.add("ps");
        list.add("mp");
        list.add("tm");
        list.add("kt");

        System.out.println("Print the ArrayList: " + list);

        System.out.println("*************************");

        System.out.println("Reverse ArrayList in Java: " + list.reversed());
    }
}
