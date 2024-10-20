package oct.ex_14102024.Task;
//
//Book class which has an abstract method getDetails(),name, author, price.
//
//PrintMyBook class that inherits from the Book class.
//
//abstract
//
//Book myBook = new PrintMyBook("Harry Potter", "J.k. Rowling", "120");
//
//// Output
//
//"Harry Potter, J.k. Rowling, 100"

public abstract class Book {
    protected String name;
    protected String author;
    protected double price;

    public Book(String name, String author, double price) {
        this.name = name;
        this.author = author;
        this.price = price;
    }

    abstract void getDetails();
}
