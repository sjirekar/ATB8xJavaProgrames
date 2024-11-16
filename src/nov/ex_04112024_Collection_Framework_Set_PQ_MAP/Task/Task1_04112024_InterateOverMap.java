package nov.ex_04112024_Collection_Framework_Set_PQ_MAP.Task;

import java.util.HashMap;
import java.util.Map;

public class Task1_04112024_InterateOverMap {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap();

        map.put("Roll_No:1",56);
        map.put("Roll_No:2",75);
        map.put("Roll_No:3",89);
        map.put("Roll_No:4",99);
        map.put("Roll_No:5",59);

        System.out.println(map);

        //Iterate over Map
        System.out.println("------------------");
        for (Map.Entry<String, Integer> item:map.entrySet())
        {
            System.out.println("Value of map using iteration:" + item.getKey() + "->>>>>" + item.getValue());
        }

    }
}
