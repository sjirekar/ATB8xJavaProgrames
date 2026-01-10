package oct.ex_14102024_Abstraction;

public class Lab143 {

    //Abstract class: Can have abstract method or concrte/compete method/non=abstract methods
    abstract class Loan {
        //Incomplete method:>abstract
        abstract void loan500K(); //Incomplete class
        //Complete method:>
        void loan1L() {
            System.out.println("1L Loan is there");
        }
    }

    abstract class loan2 {
        void loan1L() {
            System.out.println("1L Loan is there");
        }
    }


    //Concrete Class ->
    class Person {
    }

    class Student1 {
    }

    class Student2 {
    }
}
