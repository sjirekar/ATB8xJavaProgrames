package oct.ex_09102024_Inheritance.multilevel;

public class Lab130 extends Father {
    public static void main(String[] args) {
        Child c = new Child();
        // now Lab130 can access all attributes and methods from Father and grandfather
    }
}
