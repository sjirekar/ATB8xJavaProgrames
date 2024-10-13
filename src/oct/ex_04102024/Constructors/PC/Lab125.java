package oct.ex_04102024.Constructors.PC;

public class Lab125 {
    public static void main(String[] args) {
        AHuman amit = new AHuman();
        AHuman pramod = new AHuman("Pramod");
        AHuman vijay = new AHuman("Vijay");
        new AHuman();

        System.out.println(amit.name); //Will print null values as String name value is not in AHuman Class
        //Parametrized constructor:> They can set or initialise the instance variable values.
        System.out.println(pramod.name); //Pramod
        System.out.println(vijay.name);  //Vijay


        System.out.println(amit.planet);
        System.out.println(pramod.planet);


    }
}
