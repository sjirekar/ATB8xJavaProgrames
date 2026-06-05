package codingPractice;

import java.util.HashSet;
import java.util.Set;

public class C21_FindDuplicatesElementInArray {
    public static void main(String[] args) {
        int[] arr = {1,2,3,2,4,1,3,5,6};
        Set<Integer> set = new HashSet<>();

        for(int num : arr){
            if(!set.add(num))
            {
                System.out.println(num);
            }

        }
    }
}
