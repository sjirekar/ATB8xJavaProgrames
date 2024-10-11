package oct.Tasks;

public class ATBStudent {
//    Task 3: Create a Class  ATBStudent and 5 Objects - (A/B) - github.com

    //A > Attributes
    long phone;
    String email;
    int age;
    int batch8x;
    String name;
    boolean gender;
    String address;
    boolean isfeePaid;
    String githubink;
    String id;

    //B ->Behaviors
    void study(){} //NRNA
    void eat(){}
    void walk(){}
    void task(){}
    void workAtoffice(){}
    public static void main(String[] args) {
        //created 5 objects here
        ATBStudent atb = new ATBStudent();
        atb.age = 30;
        System.out.println(atb.age);

        ATBStudent atb1 = new ATBStudent();
        atb.name = "suraj";
        System.out.println(atb.name);

        ATBStudent atb2 = new ATBStudent();
        atb.email = "abc@gmail.com";
        System.out.println(atb.email);

        ATBStudent atb3 = new ATBStudent();
        atb.gender = true;
        System.out.println(atb.gender);

        ATBStudent atb4 = new ATBStudent();
        atb.id = "abc001";
        System.out.println(atb.id);

    }

}


