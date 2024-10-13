package oct.ex_09102024_Inheritance.singleinheritance.ex1;

public class Son extends Father{
    //son ->Father


    void bhk3(){
        System.out.println("3Bhk");
        //Attribute Father
        System.out.println(gold_f);
        //Behavior
        bhk2();
    }
}
