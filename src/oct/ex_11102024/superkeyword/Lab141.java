package oct.ex_11102024.superkeyword;

public class Lab141 {
    public static void main(String[] args) {
        BaseClass t1 = new TestCase1(); //Dynamic dispatch

        //ex for possibilities
        //BaseClass t2 = new TestCase1(); //possible
        //TestCase1 t3 = new TestCase1(); //possible
        //BaseClass t1 = new TestCase1(); //possible :> Dynamic Dispatch

        t1.openBrowser();
        t1.openBrowser("edge");
        t1.closeBrowser();
    }
}
