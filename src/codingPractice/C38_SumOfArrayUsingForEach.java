package codingPractice;

public class C38_SumOfArrayUsingForEach {
    public static void main(String[] args) {
        int [] arr = {12,34,70};
        int sum=0;
        for(int num:arr)
        {
             sum = sum + num;
        }
        System.out.println("Sum of an array element is: " +sum);
    }
}
