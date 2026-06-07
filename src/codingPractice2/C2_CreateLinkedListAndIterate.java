package codingPractice2;
import java.util.*;

public class C2_CreateLinkedListAndIterate {
    public static void main(String[] args) {
        List<String> linkedList = new LinkedList<>();
        linkedList.add("SJ");
        linkedList.add("VS");
        linkedList.add("SV");
        linkedList.add("VS");

        Iterator<String> itr = linkedList.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }
    }
}
