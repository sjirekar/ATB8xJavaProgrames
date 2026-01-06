package oct.ex_09102024_Inheritance.Concept_Aggregation_hasA;

public class Bike {

    //has a relations - need to directly create instance of other class
    // instead of extends which gives Is- relation / Single inheritance
    public void startBike()
    {
        new Bike_Engine().start();
        new Bike_Tyre().tyre();
    }

}

