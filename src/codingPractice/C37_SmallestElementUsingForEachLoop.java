package codingPractice;

public class C37_SmallestElementUsingForEachLoop {
    public static void main(String[] args) {
        int[] numbers = {12,34,25,4};
        int min = numbers[0];
        for(int number :numbers)
        {
           if(number<min)
           {
               min=number;
           }
        }
        System.out.println("Smallest element is: " +min);
    }
}
