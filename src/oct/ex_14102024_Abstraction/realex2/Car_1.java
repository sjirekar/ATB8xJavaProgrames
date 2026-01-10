package oct.ex_14102024_Abstraction.realex2;

public class Car_1 extends Engine_1{

    //driveCar
    void driveCar(){
        start();
        stop();
    }

    @Override
    void start() {
        System.out.println("Starting the car");
    }

    @Override
    void stop() {
        System.out.println("Stopping the car");
    }
}
