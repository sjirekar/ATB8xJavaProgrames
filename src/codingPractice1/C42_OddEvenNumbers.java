package codingPractice1;

public class C42_OddEvenNumbers {
    public static void main(String[] args) {
        int [] arr = {1, 2, 3, 4};
        System.out.print("Even Numbers: ");

        for(int num : arr)
        {
           if(num%2==0)
           {
               System.out.println(num+ " ");
           }
        }
        System.out.print("\n Odd Numbers: ");
        for (int num: arr)
        {
            if(num%2 !=0)
            {
                System.out.print(num+ " ");
            }
        }
    }
}
