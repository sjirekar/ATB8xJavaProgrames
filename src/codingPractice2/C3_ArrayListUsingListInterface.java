package codingPractice2;


import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

class Book{
    //declared variables
    int id;
    int quantity;
    String name, author, publisher;
    //created book method and passed all argument or parameter list
    public Book(int id, String name, String author, String publisher, int quantity)
    {
    this.id=id;
    this.name=name;
    this.author=author;
    this.publisher=publisher;
    this.quantity=quantity;
    }
}

public class C3_ArrayListUsingListInterface {
    public static void main(String[] args) {
        //created list of ArrayList
        List<Book> bookList = new ArrayList<>();

        //created book objects with all values as parameter
        Book b1 = new Book(1,"Java","Kiran","KS",5);
        Book b2 = new Book(2,"C#","Suraj","SJ",10);
        Book b3 = new Book(3,"Javascript","Nikita","NJ",15);
        Book b4 = new Book(4,"Python","Vaishnavi","SV",20);

        //added books objects in list
        bookList.add(b1);
        bookList.add(b2);
        bookList.add(b3);
        bookList.add(b4);

        //iterate using for each loop
        System.out.println("The books are: ");
        for(Book b : bookList)
        {
            System.out.println(b.id + " " + b.name + " " + b.author + " " + b.publisher + " " + b.quantity);
        }
        //iterate using iterator
        Iterator<Book> itr = bookList.iterator();
        System.out.println("The books in backward are: ");
        while (itr.hasNext())
        {
           Book bs= (Book)itr.next();
            System.out.println(bs.quantity + " " + bs.publisher + " " + bs.author + " " + bs.name + " " + bs.id);
        }
    }
}


