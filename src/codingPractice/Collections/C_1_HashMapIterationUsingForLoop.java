package codingPractice.Collections;

import java.util.HashMap;
import java.util.Map;

public class C_1_HashMapIterationUsingForLoop {
    public static void main(String[] args) {
        Map<String, Integer> studentsMarks = new HashMap<>();
        studentsMarks.put("SJ", 80);
        studentsMarks.put("RJ", 70);
        studentsMarks.put("PJ", 50);

        for (Map.Entry<String,Integer> entry:studentsMarks.entrySet())
        {
            String name = entry.getKey();;
            int marks = entry.getValue();
            System.out.println("Student Name is: " +name+ "Marks are: " +marks);
        }


    }
}
