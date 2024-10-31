package oct.ex_16102024_Static_Keyword;

public class Lab157_Enum {
    public static void main(String[] args) {
        System.out.println(Color.RED.getHexocde());
        System.out.println(Color.RED.getHexocde());

        if(Color.GREEN.getHexocde() == "#61FF33"){
            System.out.println("Color is Green");
        }
    }
}
enum Color{
    RED("#FF0000"),
    GREEN("#61FF33"),
    BLUE("#3377FF"),
    YELLOW("#4477FF");



    private String hexocde;
    private Color(String hexcode)
    {
        this.hexocde = hexcode;
    }

    public String getHexocde(){
        return this.hexocde;
    }
}