package oct.ex_11102024_Encapsulation.superkeyword;

public class Lab139 {
    //super keyword -> In java is reference variable that allows
    //a sub-class or child class (to reference the parent class)

    //1. Use of super with Variables
    //2. Use of super with Methods
    //3. Use of super with Constructors
    public static void main(String[] args) {
        Car c = new Car();

    }

}

class Car extends Vehicle {
    private int maxSpeed = 281;

    void display(){
        System.out.println("Child");
    }

    Car() {
        //super(); //this will call param constructor -> as for now:Ony one constrictor call is allowed in constructor
        super(10); //Constructor chaining
        System.out.println("DC Car");
        //My own class
        System.out.println(this.maxSpeed); // call from my / own class
        this.display(); //child display

        //From Parent class
        System.out.println(super.maxSpeed); // call from parent class
        super.display(); //Parent display
    }
}

class Vehicle {
    public int maxSpeed = 180;

    void display(){
        System.out.println("Parent");
    }

    Vehicle() {
        System.out.println("DC Vehicle");
    } //default constructor of vehicle class

    Vehicle(int a) {
        System.out.println("PC Vehicle");
    } //parametrize constructor of vehicle class

    void message() {
        System.out.println("Hello Vehicle");
    }

    void message(int a) {
        System.out.println("Hello vehicle");
    }

}
