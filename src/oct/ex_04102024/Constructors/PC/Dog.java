package oct.ex_04102024.Constructors.PC;

public class Dog {
    String name;
    int age;
    int legs;
    String breed;

    //Default Constructor
    Dog() {
        System.out.println("I am DC");
        System.out.println("Dog is happy");
    }


    //Parametrize Constructor
    Dog(String breed) {
        System.out.println("I am PC");
        this.breed = breed;
    }

    Dog(String breed, String name, int age, int legs) {
        System.out.println("I am PC");
        this.breed = breed;
        this.name = name;
        this.age = age;
        this.legs =legs;
    }

    void walk() {

    }
}
