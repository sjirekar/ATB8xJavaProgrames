package oct.ex_30102024_Collections_Framework_Part2;

import java.util.ArrayList;
import java.util.List;

public class Lab208_List {
    public static void main(String[] args) {
    Student s1 = new Student("Amit", 1);
    Student s2 = new Student("Anil", 2);
    Student s3 = new Student("Suraj", 3);

        List<Student> myStudenets = new ArrayList<>();
        myStudenets.add(s1);
        myStudenets.add(s2);
        myStudenets.add(s3);
        System.out.println("-------------------Below is first way using toString");
        System.out.println(myStudenets);
        System.out.println("-------------------Below is another way using printDetails");
        System.out.println(s1.printDetails());
        System.out.println(s2.printDetails());
        System.out.println(s3.printDetails());

    }
}

class  Student{
    String name;
    Integer rollNo;

    public Student(String name, Integer rollNo) {
        this.name = name;
        this.rollNo = rollNo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getRollNo() {
        return rollNo;
    }

    public void setRollNo(Integer rollNo) {
        this.rollNo = rollNo;
    }


    //One way to print the details of objects we need to use toString method
    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", rollNo=" + rollNo +
                '}';
    }

    //Other way is Print statement
    public String printDetails() {
        return "Student{" +
                "name='" + name + '\'' +
                ", rollNo=" + rollNo +
                '}';
    }
}
