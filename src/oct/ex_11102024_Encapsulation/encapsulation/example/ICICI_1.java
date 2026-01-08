package oct.ex_11102024_Encapsulation.encapsulation.example;

public class ICICI_1 {
    private String name;
    private long bal;

    public ICICI_1(String name, long bal) {
        this.name = name;
        this.bal = bal;
    }

    public String getName(boolean isAdmin) {
        if (isAdmin) {
            return name;
        }else {
            return null;
        }
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getBal() {
        return bal;
    }

    public void setBal(long bal, boolean isAdmin) {
        if(isAdmin)
        {
            this.bal = bal;
            System.out.println("Allowed");
        }
        else {
            System.out.println("Not Allowed");
        }
    }
}
