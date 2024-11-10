package oct.ex_30102024_Collections_Framework_Part2;

import java.util.Stack;

public class Lab207_Stack {
    public static void main(String[] args) {
        //Vector, Stack are Lagacy -
        //95 % of the time we are not going to user it in automation

        //ArrayList - 95% we are going to use
        //Stack Ex:
        Stack s = new Stack();
        s.add("Pramod");
        s.add("Dutta");
        System.out.println(s); //LIFO:>Last in first out

        System.out.println("*********************");

        //Ex 2:
        Stack books = new Stack();
        books.push("Python");
        books.push("Java");
        books.push("C#");
        System.out.println(books.peek()); //Peek -> will give last element
        System.out.println(books);
        System.out.println(books.pop()); // LIFO:> Last in one will be first out
        System.out.println(books);

        System.out.println("*********************");
        //Ex:3
        Stack s1 = new Stack();
        s1.push("Pramod");
        s1.push("Dutta");
        s1.push("Suraj");
        s1.add("Jirekar");
        System.out.println(s1.size());
        System.out.println(s1);
        System.out.println(s1.peek());
        System.out.println(s1);
        System.out.println(s1.pop());
        System.out.println(s1);
        System.out.println(s1.empty()); //false
        System.out.println(s1.add("Pratik"));

        System.out.println("/--------Before-------/");
        System.out.println(s1);
        System.out.println("/--------After Add At Index-------/");
        s1.add(0,"Lucky");
        System.out.println(s1);
        System.out.println(s1.get(0));





    }
}
