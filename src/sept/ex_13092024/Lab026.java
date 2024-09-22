package sept.ex_13092024;

public class Lab026 {
    public static void main(String[] args) {
        //Constants
        //constant are variables
        //whose values cannot be changed once they are assigned
        //final --- final dataType CONSTANT_NAME = value;
        final float PIE = 3.1456f;
        System.out.println(PIE);



        //is this allowed??
        final float PIE1; //yes
        PIE1 = 3.14F;//values cannot be changed once they are assigned -- here values is assigned first time
        System.out.println(PIE1);
    }
}
