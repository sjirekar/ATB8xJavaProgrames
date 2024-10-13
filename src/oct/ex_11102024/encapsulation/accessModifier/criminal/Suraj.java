package oct.ex_11102024.encapsulation.accessModifier.criminal;

import oct.ex_11102024.encapsulation.accessModifier.police.Cop;

public class Suraj {
    Cop suraj = new Cop(90);
    //suraj.canIShoot();//Not allowed as this method is outside or package criminal and its protected

}
