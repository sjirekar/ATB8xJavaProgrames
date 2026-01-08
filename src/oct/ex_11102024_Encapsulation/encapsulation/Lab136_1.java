package oct.ex_11102024_Encapsulation.encapsulation;

public class Lab136_1 {
    public static void main(String[] args) {

        //bad ex for encapsulation
        VWOLogin_1 vwoLogin_1 = new VWOLogin_1("admin", "password13");

        System.out.println(vwoLogin_1.password);
        vwoLogin_1.password = "hacked";
        System.out.println(vwoLogin_1.password);


        //good ex of encapsulation
        GoodVWOLogin_1 goodVWOLogin_1 = new GoodVWOLogin_1("goodAdmin", "password14");
        //System.out.println(goodVWOLogin_1.password); //cant access as they are private and protected

        boolean isAdmin = true;

        System.out.println(goodVWOLogin_1.getPassword());

        //setting new pass
        goodVWOLogin_1.setPassword("passwrod15",isAdmin);
        System.out.println(goodVWOLogin_1.getPassword());

    }
}
