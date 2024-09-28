package sept.ex_23092024;

public class Lab079 {
    public static void main(String[] args) {
        //Web Automation
        //I will ask which browser to run
        //chrom -> execute chrome;
        //firefox -> execute firefox;
        //ie -> execute IE;
        //edge -> execute edge;
        String browser = "chrome";
        switch (browser)
        {
            default:
                System.out.println("I have No idea which browser it is: ");
                break;
            case "chrome":
                System.out.println("Starting the chrome browser");
                break;
            case "firefox":
                System.out.println("Starting the firefox browser");
                break;
            case "edge":
                System.out.println("Starting the edge browser");
                break;

        }
        System.out.println("end of loop");

    }
}