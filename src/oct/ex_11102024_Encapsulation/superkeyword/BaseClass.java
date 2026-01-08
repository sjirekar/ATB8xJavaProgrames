package oct.ex_11102024_Encapsulation.superkeyword;

public class BaseClass {
    private String browser;

    public BaseClass() {
        System.out.println("DC - BaseClass");
    }

    public BaseClass(String b) {
        System.out.println("PC - BaseClass");
    }

    public String getBrowser() {
        return browser;
    }

    public void setBrowser(String browser, boolean isAuth) {
        if (isAuth) {
            this.browser = browser;
        } else {
            System.out.println("Not Allowed");
        }
    }
    void openBrowser() {
        System.out.println("Chrome Browser");
    }

    void openBrowser(String browserName) {
        System.out.println("Open Browser! -> " + browserName);
    }

    void closeBrowser() {
        System.out.println("Close Browser");
    }

}
