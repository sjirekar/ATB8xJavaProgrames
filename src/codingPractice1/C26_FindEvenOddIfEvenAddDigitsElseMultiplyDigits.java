package codingPractice1;

public class C26_FindEvenOddIfEvenAddDigitsElseMultiplyDigits {
    public static void main(String[] args) {
        int[] arr = {11, 14, 25, 33, 57, 72, 100};
        for(int num : arr)
        {
            int temp = num;
            if(num%2==0)
            {
                int sum = 0;
                while(temp>0)
                {
                    sum = sum+(temp%10);
                    temp = temp/10;
                }
                System.out.println(num + " (even) -> The sum is = " + sum);
            }
            else{
                int product=1;
                while (temp>0)
                {
                    product = product*(temp%10);
                    temp = temp/10;
                }
                System.out.println(num + " (odd) -> The multiplication is = " + product);
            }
        }

    }
}
