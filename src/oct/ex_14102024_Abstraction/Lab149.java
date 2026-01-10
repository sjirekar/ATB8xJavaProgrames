package oct.ex_14102024_Abstraction;

public class Lab149 {
}

interface I3 {
    //default method: only method from interface that can have body
    default void start() {
        System.out.println("Body of default");
    }
   //Incomplete methods are allowed but not compete
    void stop();
    void car();

    //Static methods: only method from interface that can have body
    static void ss(){
        System.out.println("Static can alos have body in interface");
    }
    abstract class AA{
        //abstract can have concrete or incomplete methods too
        void f1()
        {
            System.out.println("Concrete Method");
        }
        abstract void f2();

        //abstract class can hav static methods but abstract cass cannot be static
        static void f4(){
            System.out.println("Yes");
        }
    }
}
