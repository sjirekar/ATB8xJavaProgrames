package oct.ex_11102024.Task;

public class APIAutomation {
    public static void main(String[] args) {
        BaseTestAPI aa = new TestCaseAPI(); //Dynamic dispatching


        aa.performHTTPMethod("POST");
        aa.performPOST();
        aa.performPATCH();
        aa.performPUT();
        aa.performDELETE();


    }
}
