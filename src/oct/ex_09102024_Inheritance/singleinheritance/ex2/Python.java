package oct.ex_09102024_Inheritance.singleinheritance.ex2;

public class Python extends Programming{
    //Is A Programming lang
    //Is A relationship -> so always Singe inheritance is used

    public Python(){
        System.out.println("DC");
    }
    void print(){
        System.out.println(author);
        System.out.println(version);
    }
}
