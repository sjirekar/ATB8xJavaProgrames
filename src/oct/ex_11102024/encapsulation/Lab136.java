package oct.ex_11102024.encapsulation;

public class Lab136 {
    public static void main(String[] args) {
        //Bad ex of encap
        VWOLogin vwologin = new VWOLogin("admin", "password12");
        System.out.println(vwologin.password);
        vwologin.password = "hacker"; //since anyone can access and change the value of clas instances
        System.out.println(vwologin.password);

        GoodVWOLogin vwoLogin1 = new GoodVWOLogin("goodadmin","admin123");
       //System.out.println(vwoLogin1.password); // Cant be access as they are private and protected in class

        //Checking Admin
        boolean isAdmin =true;
        System.out.println(vwoLogin1.getPassword());
        vwoLogin1.setPassword("newpassword", isAdmin);
    }
}
