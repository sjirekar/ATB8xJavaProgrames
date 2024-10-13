package oct.ex_11102024.encapsulation.accessModifier.police;

public class JrCop {
    public static void main(String[] args) {
        Cop jrCop = new Cop(20);
        //System.out.println(jrCop.gun);

        jrCop.canIShoot();//allowed as its in same folder and method is protected in other class
    }
}
