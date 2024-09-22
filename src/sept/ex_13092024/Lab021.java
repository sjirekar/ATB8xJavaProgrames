package sept.ex_13092024;

public class Lab021 {
    public static void main(String[] args) {
        //problem statement->> print table of 2
        //Using String formatting
        int num = 2;
        // %d - any int, byte, short, long
        // %c - any char
        // %s - any string
        // %f - any float, double

        //System.out.printf("Value of %d",num);
        // printing table of 2
        System.out.printf("%d * %d = %d", num,1,num*1);
        System.out.println();
        System.out.printf("%d * %d = %d", num,2,num*2);
        System.out.println();
        System.out.printf("%d * %d = %d", num,10,num*10);

    }
}
