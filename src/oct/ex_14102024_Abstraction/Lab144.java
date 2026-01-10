package oct.ex_14102024_Abstraction;

public class Lab144 {
    public static void main(String[] args) {
        ChromeTC c = new ChromeTC();
        c.openBrowser("Chrome");
        c.closeBrowser("Chrome");
        c.takescreenshot();
        c.noBodyKnoWhereIAmPresent();

        FifefoxTC fifefoxTC = new FifefoxTC();
        fifefoxTC.openBrowser("Firefox");
        fifefoxTC.closeBrowser("Firefox");
        fifefoxTC.takescreenshot();
        fifefoxTC.noBodyKnoWhereIAmPresent();

    }
}
