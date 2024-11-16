package nov.ex_04112024_Generics;

public class Lab216_Generics {
    public static void main(String[] args) {
        //Generics-> Available for all
        temp(12); //supports only one data type
        //temp("Pramod"); //not allowed

        Math.max(1,2); //integer
        Math.max(1.3,2.4); //double
        Math.max(1.33,2.44); //float
        Math.max(2334554,356565464); //long


    }
    public  static void  temp(Integer a)
    {
        System.out.println(a);
    }
}
