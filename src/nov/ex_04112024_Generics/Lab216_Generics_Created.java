package nov.ex_04112024_Generics;

public class Lab216_Generics_Created {
    public static void main(String[] args) {
        //Generics-> Available for all
        temp(12);
        temp("Pramod");
        temp(true);
        //T - ref - It can be anything
    }
    public  static<T> void  temp(T a)
    {
        System.out.println(a);
    }
}
