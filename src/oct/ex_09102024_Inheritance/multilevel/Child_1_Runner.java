package oct.ex_09102024_Inheritance.multilevel;

public class Child_1_Runner {
    public static void main(String[] args) {
        Child_1 child1 = new Child_1();
        //taken all properties from Granfather
        child1.home();
        child1.gf();
        child1.bhk1();

        //taken all properties from Father
        child1.fHome();
        child1.bhk2();
        child1.extra();

        //Own properties

        child1.cHome();
        child1.bhk3();
        child1.garden();
    }
}
