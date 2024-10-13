package oct.ex_09102024_Polymorphism.methodoverriding.real;

public class Lab134 {
    public static void main(String[] args) {
//        Pramod p = new Pramod();
//        p.home();
//
//        Father f = new Father();
//        f.home();


        //Dynamic Dispatch
        Father object = new Pramod();
        object.home();
//        ex: WebDriver drivr = new ChromDriver;

        //Pramod object1 = new Father(); // not possible

    }
}
