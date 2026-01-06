package oct.ex_09102024_Polymorphism.methodoverloading;

public class Runner_MethodOverload {
    public static void main(String[] args) {
        MathOperations_1 mathOperations1 = new MathOperations_1();
        int result = mathOperations1.add(5,6);
        System.out.println(result);

        String sResult = mathOperations1.add("Suraj", "Niki");
        System.out.println(sResult);
    }
}
