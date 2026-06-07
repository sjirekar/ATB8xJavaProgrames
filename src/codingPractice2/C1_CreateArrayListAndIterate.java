package codingPractice2;
import java.util.*;

public class C1_CreateArrayListAndIterate {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("Suraj");
        list.add("Nikita");
        list.add("Vaishnavi");
        list.add("SJ");
    Iterator<String> itr = list.iterator();
    while(itr.hasNext()){
        System.out.println(itr.next());
    }

    }
}
