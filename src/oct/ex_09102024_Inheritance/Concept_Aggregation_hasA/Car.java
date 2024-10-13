package oct.ex_09102024_Inheritance.Concept_Aggregation_hasA;

public class Car {
    //Car Has A -> Engine, Tyre - Has A ->Also called as Aggregation
    protected void startCar() {
        new Engine().start();
        new Tyre().rolling();
    }
}
