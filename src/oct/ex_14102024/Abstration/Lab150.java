package oct.ex_14102024.Abstration;

public class Lab150 {
}

interface I1
{
}
interface I2
{
}
class A{}
class B{}

class Test1 extends A{} //single inheritance
//class Test2 extends A,B{} //multiple inheritance is not possible with multiple classes
class Test3 implements I1{
    int age =10; //all are in constance in interface
}
class Test4 implements I1,I2{}//Multiple inherticae is possible only using interfaces
class Test5 extends A implements I1,I2{} //possible
//class Test6 implements I1 extends A{}//Not possible:> extends always should be first than implements