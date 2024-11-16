package nov.ex_04112024_Collection_Framework_Set_PQ_MAP;

import java.util.HashMap;
import java.util.Map;

public class Lab212_MAP {
    public static void main(String[] args) {
        //Map -> Key and value pair
        //The Key will be always unique in case of Map
        //Map store like this:> name:pramod, roll:31, phone:9090909090
        Map m1 = new HashMap(); //order is not maintained
        //Map m1 = new LinkedHashMap(); // order is maintained
        //Map m1 = new TreeMap(); // sorted and order is maintained

        m1.put("name", "Pramod");
        m1.put("rollNo", 123);
        m1.put("phone", 909090909);
        System.out.println(m1);


    }
}
