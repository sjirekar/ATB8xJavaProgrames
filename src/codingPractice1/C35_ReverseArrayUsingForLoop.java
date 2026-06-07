package codingPractice1;

public class C35_ReverseArrayUsingForLoop {
    public static void main(String[] args) {
        int[] numbers = {1,2,3,4,5};
        System.out.print("Reversed array is: ");
        for(int i=numbers.length-1; i>=0; i--)
        {
            System.out.print(numbers[i]+ " ");
        }
    }
}
