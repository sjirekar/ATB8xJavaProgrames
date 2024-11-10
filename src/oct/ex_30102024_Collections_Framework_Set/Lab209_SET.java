package oct.ex_30102024_Collections_Framework_Set;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class Lab209_SET {
    public static void main(String[] args) {
        //List -> Duplicates are allowed
        //Set -> Doesn't allow duplicates

        Set hs = new HashSet();
        Set lhs = new LinkedHashSet();
        Set ts = new TreeSet();

        hs.add("Pramod");
        hs.add("Pramod"); //Duplicates are not allowed
        hs.add("pramod"); //as p small and its allowed
        hs.add("Dpramod");
        System.out.println(hs);



    }
}
