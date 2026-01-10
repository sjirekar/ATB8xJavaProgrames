package oct.ex_14102024_Abstraction.Task;

public class Lab152 {
    public static void main(String[] args) {
//        Book book = new Book(); //Not possible:> Object of abstract class is not possible
//        Book myBook = new PrintMyBook("Harry Potter", "J.k. Rowling", 100); //Possible:> Dynamic dispatch
//        myBook.getDetails(); //possible

        PrintMyBook book = new PrintMyBook("Harry Potter", "J.k. Rowling", 100);
        book.getDetails();
    }
}
