package sept.ex_30092024.Task;

public interface Task_30092024_Task_1 {
    public static void main(String[] args) {
//        Factorial Program - n = 5 , Output = 120 //  n = 5 ->  Fact = 5*4*3*2*1 = 120//
//        // n = 1 ->  Fact = 1*1 -> 1//
//        // n = 3 -> Fact = 3*2*1 -> 6
//
        int i,fact=1;
        int number=5;//It is the number to calculate factorial
        for(i=1;i<=number;i++){
            fact=fact*i;
        }
        System.out.println("Factorial of "+number+" is: "+fact);
    }
}

