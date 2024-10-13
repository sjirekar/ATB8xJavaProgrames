package oct.ex_09102024_Polymorphism.methodoverriding;

public class Hound extends Dog{
//    void bark(){
//        System.out.println("I am Hound, i will Bark");
//    }
    @Override
    void bark() {
        System.out.println("I am Hound, i will Bark");
        super.bark();
    }
}
