package oct.ex_04102024.Constructors.PC.Task;

public class Person {
    //Create a Person Class with 10 A, 5 Behavr( All types of Methods) and use the DC and PC to set the values, Create 5 Objects.
    //Attributes
    String name;
    int age = 30;
    long adhar_no;
    String address;
    String email = "abc@gmail.com";
    int phone_no;
    String gender;
    boolean salaried;
    boolean working;
    boolean hasCar;

    //Constructors
    //Default constructor (of class)
    Person() {
        System.out.println("I will be called when object is created");
        //Write a code which will automatically called when object is created
        //Read a file like txt
        //Read a CSV fie or Excel file here

    }

    //Parametrize constructor
    Person(String name) {
        System.out.println("Hi, I am Parm Constructor1");
        this.name = name;
    }

    Person(long adhar_no){
        System.out.println("Hi, I am Parm Constructor2");
        this.adhar_no = 123456678912L;
    }


    //Behaviours:
    void travel() {
        System.out.println("NRNA");
    }
    int age() {
        System.out.println("RTNA");
        return 30;
    }
    String drive(String name) {
        System.out.println("Driving");
        System.out.println("RTWA");
        return "I am driving";
    }
    void play(String player) {
        System.out.println("NRWA");
        System.out.println("Playing");
    }

    void sing(String singer) {
        System.out.println("NRWA");
        System.out.println("Singing");
    }







}
