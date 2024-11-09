package oct.ex_28102024_CollectionFramework;

import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

public class Lab204_Vector {
    public static void main(String[] args) {
        List myList1 = new ArrayList(5); //FR - CO
        myList1.add("Pramod");
        myList1.add("Dutta");
        myList1.add("Amit");
        myList1.add("Amit");
        myList1.add("Amit");
        myList1.add("Amit");
        System.out.println(myList1);

        //Vector
        Vector v = new Vector();
        v.add("Pramod"); //t1
        v.add("Anusha"); //t2
        v.add("Kiran"); //t3
        System.out.println(v);
        System.out.println(v.size());
        System.out.println(v.isEmpty());
        System.out.println(v.indexOf("Kiran"));
        System.out.println(v.lastIndexOf("Kiran"));
        System.out.println(v.contains("Kiran"));
        //System.out.println(v.rplaceAll"Kiran"); //Not present


        //Only Problem with the Vector
        //It is Thread Safe, synchronized
        //It will be time-consuming
        //One by one - usage
        //Slower



    }
}
