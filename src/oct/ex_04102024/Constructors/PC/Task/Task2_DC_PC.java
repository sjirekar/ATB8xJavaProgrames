package oct.ex_04102024.Constructors.PC.Task;

public class Task2_DC_PC {
    public static void main(String[] args) {
        Person pratik = new Person();
        Person suraj = new Person("Suraj");
        Person sj = new Person("Rahul");
        new Person();


        System.out.println(pratik.name); //Will display null values as no values is set and returned in Person class



        System.out.println(suraj.name);// Will display Suraj as caling param constructors
        System.out.println(sj.name);// Will display Rahul as caling param constructors
        System.out.println(pratik.adhar_no);


        System.out.println(suraj.age);
        System.out.println(sj.email);
    }
}
