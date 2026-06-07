package codingPractice2;

public class C14_MethodOverridingProgram {
    public static void main(String[] args) {
        SBI sbi = new SBI();
        ICICI icici = new ICICI();
        AXIS axis = new AXIS();
        System.out.println("Rate of Interest of all banks are: "+"SBI: "+sbi.getRateOfInterest()+" "
        + "ICICI: " + icici.getRateOfInterest() + " " + "AXIS: " + axis.getRateOfInterest());

    }
}
class Bank{
    int getRateOfInterest(){
        return 0;
    }
}
class SBI extends Bank{
    int getRateOfInterest(){
        return 7;
    }
}
class ICICI extends Bank{
    int getRateOfInterest() {
        return 8;
    }
}
class AXIS extends Bank{
    int getRateOfInterest(){
        return 9;
    }
}
