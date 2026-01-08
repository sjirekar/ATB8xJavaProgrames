package oct.ex_11102024_Encapsulation.encapsulation.example;

public class Lab_137_1 {
    public static void main(String[] args) {
        ICICI_1 amit = new ICICI_1("amit", 1000);

      //  amit.bal = 10000; // not allowed as we have made this private
      //amit.setBal(100000); // This should be only allowed to change for Admin only
        boolean are_you_admin =true;
        ICICI_1 admin = new ICICI_1("admin", 10000);

        admin.setBal(5000,true);
        //admin.setBal(5000,false); //for normal user
        System.out.println(admin.getName(are_you_admin));
        System.out.println(admin.getBal());






    }
}
