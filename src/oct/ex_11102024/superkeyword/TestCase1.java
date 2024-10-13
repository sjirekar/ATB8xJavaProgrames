package oct.ex_11102024.superkeyword;

public class TestCase1 extends BaseClass{
    //TestCase is A Type of BaseClass - single Inheritance
    TestCase1(){
        super(); //call DC of parent
        this.setBrowser("edge",true);
    }

    @Override
    public void setBrowser(String browser, boolean isAuth){
        System.out.println("You can write Own logic");
        //Or call parent class
        super.setBrowser(browser,isAuth);

    }
}
