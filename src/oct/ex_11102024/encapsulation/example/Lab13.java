package oct.ex_11102024.encapsulation.example;

public class Lab13 {
    public static void main(String[] args) {
        ICICIBank amit = new ICICIBank("Amit", 100);
        // amit.bal = 10000; //Not allowed as its private
        //amit.setBal(10000); // as now checking admin code is added at this point
        //This should be allowed to admin only

        //Write a code to connect with mySQL
        //Admin
        boolean are_you_admin = true;
        ICICIBank admin = new ICICIBank("admin", 1000);
        admin.setBal(50000, true);
        //admin.setBal(6000,false);
        System.out.println(admin.getName(are_you_admin));

    }
}