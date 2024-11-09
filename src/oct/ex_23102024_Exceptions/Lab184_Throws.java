package oct.ex_23102024_Exceptions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Lab184_Throws {

    public static void main(String[] args) throws FileNotFoundException, Exception{
        extracted();
    }
    private static void extracted() throws FileNotFoundException{
        FileInputStream fileInputStream = new FileInputStream("data.txt");
    }
}
