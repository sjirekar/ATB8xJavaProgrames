package oct.ex_11102024.encapsulation.example;

public class ICICIBank {
    //Encapsulation
    //- Encapsulation -> Is the fundamental concept in object-oriented programming language (oops)
    //- Bundling of data methods that operate on that data withing a single unit
    //- Data members should be private in nature
    //- Methods with getter and setter only, you can access the data members (or attribute

    private String name;
    private long bal;

    //param constructors
    public ICICIBank(String name, long bal) {
        this.name = name;
        this.bal = bal;
    }

    //getter setter methods for both instances
    public String getName(boolean isAdmin) {
        if (isAdmin) {
            return name;
        } else {
            return "Null";
        }
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getBal() {
        return bal;
    }

    public void setBal(long bal, boolean isAdmin) {
        if (isAdmin) {
            this.bal = bal;
            System.out.println("Allowed");
        } else {
            System.out.println("Not allowed");
        }
    }
}
