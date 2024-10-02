package sept.ex_25092024;

public class Lab107 {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) { //0-9
            System.out.println(i);
            if(i==5){
                continue; //in case of 5 next statement is not printed as it will continue to previous code
            }
            System.out.println("After");
        }
    }
}
