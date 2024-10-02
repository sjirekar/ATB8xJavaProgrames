package sept.ex_25092024;

public class Lab108 {
    public static void main(String[] args) {
        //print values of even and off nos from 0 -50
        for (int i = 0; i < 50; i++) {
            {
                if(i%2==0)
                {
                    System.out.println("Even->" + i);
                    continue;
                }
                System.out.println(i);
            }

        }
    }
}
