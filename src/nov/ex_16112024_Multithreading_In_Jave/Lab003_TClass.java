package nov.ex_16112024_Multithreading_In_Jave;

public class Lab003_TClass {
    public static void main(String[] args) {
        Test<Integer> i = new Test<Integer>(5);
        System.out.println(i.getObj());

        Test<Double> i2 = new Test<Double>(5.2);
        System.out.println(i2.getObj());

        Test<String> i3 = new Test<String>("Suraj");
        System.out.println(i3.getObj());
    }
}

class Test <T>{
    T obj;
    Test(T obj)
    {
        this.obj = obj;
    }
    public T getObj(){
        return this.obj;
    }
}