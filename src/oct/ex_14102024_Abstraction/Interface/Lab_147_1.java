package oct.ex_14102024_Abstraction.Interface;

public class Lab_147_1 {

    public void main(String[] args) {
        P1 p1 = new P1();
        p1.f1();
    }

}



class P1 implements I5{

    @Override
    public void f1() {
        System.out.println("Created P");

    }

    @Override
    public void f2() {

    }

    @Override
    public void f3() {

    }
}

    interface I5{
         void f1();
         void f2();
         void f3();
    }

