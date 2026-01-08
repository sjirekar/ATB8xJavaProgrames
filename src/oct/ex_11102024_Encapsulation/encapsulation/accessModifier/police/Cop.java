package oct.ex_11102024_Encapsulation.encapsulation.accessModifier.police;

public class Cop {
    private int gun;
    private String idCard;

    public Cop(int gun) {
        this.gun = gun;
    }

    protected void canIShoot() { // this protected method can only be accessed withing same package
        System.out.println("Yes, You Can!");
    }
}
