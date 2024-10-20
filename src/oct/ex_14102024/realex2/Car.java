package oct.ex_14102024.realex2;

public class Car extends Engine{

    void drive(){
        startEngine();
        stopEngine();
    }

    @Override
    void startEngine() {
        System.out.println("Starting Car");
    }

    @Override
    void stopEngine() {
        System.out.println("Stopping Car");
    }

}
