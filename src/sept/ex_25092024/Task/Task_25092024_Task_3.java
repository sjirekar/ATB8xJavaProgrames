package sept.ex_25092024.Task;

public interface Task_25092024_Task_3 {
    public static void main(String[] args) {
//        Prime Number from 1 to 100. (for loop)
        int i =0;
        int num =0;

        String  primeNumbers = "";

        for (i = 1; i <= 100; i++)
        {
            int counter=0;
            for(num =i; num>=1; num--)
            {
                if(i%num==0)
                {
                    counter = counter + 1;
                }
            }
            if (counter ==2)
            {

                primeNumbers = primeNumbers + i + " ";
            }
        }
        System.out.println("Prime numbers from 1 to 100 are :");
        System.out.println(primeNumbers);
    }
}


