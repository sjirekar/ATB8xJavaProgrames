package oct.ex_16102024;

public class Lab153_Static {
    public static void main(String[] args) {
        Student s1 = new Student(23);
        Student s2 = new Student(25);
        System.out.println(s1);
        System.out.println(s2);
        System.out.println(Student.school_name);
        Student.school_name = "XYZ";
        System.out.println(Student.school_name);
    }
}

class Student {
    int age; //instance variable (Non-static) //Are the variables which are created at the time of object reference
    static String school_name = "ABC"; //static variables -> Are the variables which are created at the time of class loading

    //instance initialization block -> Called when object of class is created
    {
        System.out.println("IIB");
        System.out.println("Here you can write the code when object is created");
        System.out.println("Read MySQL db()");
    }

    //Static initialization block -> -> Called when class is created
    static {
        System.out.println("SIB");
        System.out.println("Loaded once, When class is loaded");
    }
    //param constructor
    public Student(int age) {
        this.age = age;
    }
}
