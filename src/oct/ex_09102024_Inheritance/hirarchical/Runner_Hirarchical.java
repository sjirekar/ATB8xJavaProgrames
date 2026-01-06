package oct.ex_09102024_Inheritance.hirarchical;

public class Runner_Hirarchical {
    public static void main(String[] args) {
        Suraj suraj = new Suraj();
        suraj.sHome();
        suraj.fHome();

        Reshama reshama = new Reshama();
        reshama.rHome();
        reshama.fHome();

        Vicky vicky = new Vicky();
        vicky.vHome();
        vicky.fHome();

        Father_1 father1 = new Father_1();
        father1.fHome();
    }

}
