package oct.ex_02102024;

import sept.Person; //its imported as we have that class in another folder

public class Lab124 {
    public static void main(String[] args) {
        //Object Class
        //String class
        //Arrays
        //for each
        //2d nested loopss


        //Class-> To Create something
        //Objects-> Instance of class - Created from the class
        ATBBlueprint suraj = new ATBBlueprint();
        suraj.age = 32;

        ATBBlueprint pramod = new ATBBlueprint();
        pramod.age = 35;

        // ATBBlueprint -> class name
        // suraj -> reference to object
        // new -> will allocate new  area which is in terms of Attribute and behaviors in heap memory
        // new ATBBlueprint(); -> its object

        //why do we do import:_> as we are accessing new class which is not in same folder
        Person pratik = new Person();
        Person ram;

        new Person();
        new Person();
        //so in total how many objects : check with 'new'
        //so in total 5 objects

        //just how they how different memory
        System.out.println(suraj); //oct.ex_02102024.ATBBlueprint@5f184fc6

        System.out.println(pramod); //oct.ex_02102024.ATBBlueprint@3feba861

        //suraj -> Reference Variable:> Reference any type:_> will take 8 byte or 64 bits and null is default value
    }
}
