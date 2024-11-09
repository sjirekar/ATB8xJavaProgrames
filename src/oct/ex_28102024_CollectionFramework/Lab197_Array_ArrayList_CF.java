package oct.ex_28102024_CollectionFramework;

import java.util.ArrayList;
import java.util.Collection;

public class Lab197_Array_ArrayList_CF {
    public static void main(String[] args) {
        // Collection ->This is interface  - 10 func
        //  List - Interface - 15 func (Total functions = 25)
        // ArrayList, LinkedList,Stack, Vector - Class

        //Shopping list -> Paneer, Milk, Bread, curd, buttermilk, butter
        //List -> Collection of Items - with same or different data types

        ArrayList studentList = new ArrayList<>();
        studentList.add("Pramod");
        studentList.add("Dutta");
        studentList.add("Dutta");//Duplicate is allowed
        studentList.add("Anil");
        studentList.add("Amit");
        studentList.add(true);//Different data type is allowed
        studentList.add(123);
        studentList.add(null);

        System.out.println(studentList);

        //Integer[] names = new Integer[5]; //Fixed, same Data Types
    }
}
