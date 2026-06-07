package codingPractice1;

import java.util.Arrays;

public class C39_SortArrayUsingForEachLook {
    public static void main(String[] args) {
        int [] arr = {52,23,8};
        System.out.print("Sorted Array: ");
        Arrays.sort(arr);
        for(int num:arr)
        {
            System.out.print(num + " ");
        }
    }
}
