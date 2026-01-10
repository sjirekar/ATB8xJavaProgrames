package oct.ex_14102024_Abstraction.Interface;

public class Lab_148_2 {
    public static void main(String[] args) {
       // abstraction -  Interface - Complete Abstraction
        ABC abc = new ABC();
        abc.f1();
        abc.f2();
        abc.f3();
        abc.f4();

        //abstraction - Interface - Complete Abstraction
        XYZ xyz = new XYZ();
        xyz.display();

    }
}

    class ABC implements I2,I3{

        @Override
        public void f1() {
            System.out.println("F1 from f1");
        }

        @Override
        public void f2() {

        }

        @Override
        public void f3() {

        }

        @Override
        public void f4() {

        }
    }

    class  XYZ{
        void display(){
            new ABC().f4();
        }
    }

    interface I2{
        void f1();
        void f2();
    }
    interface I3{
        void f3();
        void f4();
    }

