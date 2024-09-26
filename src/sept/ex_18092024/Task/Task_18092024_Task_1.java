package sept.ex_18092024.Task;

public class Task_18092024_Task_1 {
    public static void main(String[] args) {

        //Type casting
        //Widening - Implicit, explicit -lossless
        //narrowing - Implicit, explicit(with data type) - loss

        //Widening
        short price = 100;
        int rate = price; //Valid - Implicit casting - JVM
        int rate1 = (int)price;  //Valid - Explicit casting - JVM

        //Narrowing
        int cost = 300;
        //byte value = cost; //Invalid Implicit casting
        byte value1 = (byte)cost; //Valid Explicit casting --Loss of data
        System.out.println(value1);
    }
}
