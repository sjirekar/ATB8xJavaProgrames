package oct.ex_11102024_Encapsulation.encapsulation.accessModifier.criminal;

import oct.ex_11102024_Encapsulation.encapsulation.accessModifier.police.Cop;

public class Thief {
    public static void main(String[] args) {
        Cop c = new Cop(10);
        //System.out.println(c.gun); //Now not able to access as instance variable are private
        //c.canIShoot(); //Now not allowed as it's protected in class

    }
}
