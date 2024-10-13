package oct.ex_04102024.Constructors.PC;

public class AHuman {
    String eyes_color;
    String name;
    String planet = "AHuman";
    long adhar_card;

    //Default constructor (of class)
    AHuman() {
        System.out.println("I will be called when object is created");
        //Write a code which will automatically called when object is created
        //Read a file like txt
        //Read a CSV fie or Excel file here

    }

    //Parametrize constructor
    AHuman(String name) {
        System.out.println("Hi, I am Parm Constructor");
        this.name = name;
    }

    //Return tye:> void, data-type
    void walk() {
        System.out.println("NRNA");
    }

    int talk() {
        System.out.println("RTNA");
        return 10;
    }

    String sleep(String name) {
        System.out.println("Sleeping");
        System.out.println("RTWA");
        return "I am Sleeping";
    }

    void eat(String name) {
        System.out.println("NRWA");
        System.out.println("Eat");
    }

}
