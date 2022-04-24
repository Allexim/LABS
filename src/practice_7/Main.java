package practice_7;

public class Main {
    public static void main(String[] args) {


        Librarian librarian = new Book("Airport","Arthur Hailey");
        librarian.order_book();


        Reader reader = new Book("Airport","Arthur Hailey");
        reader.take_book();


        Administrator administrator = new Book("Airport","Arthur Hailey");
        administrator.find_book();
        administrator.expired_book();
        administrator.give_book();


    }
}



interface Reader {
    void take_book();
    void return_book();
}
interface Librarian {
    void order_book();
}
interface Book_Supplier  {
    void deliver_book();

}

interface Administrator  {
    void find_book();
    void give_book();
    void expired_book();
}



class Book implements Librarian,Book_Supplier,Administrator,Reader {
    String title; //book title
    String author; //book author



    public Book(String title, String author) {
        this.title = title;
        this.author = author;
    }



    @Override
    public void order_book() {
        System.out.println("The Book " + title + " was ordered");

    }



    @Override
    public void take_book() {
        System.out.println("'" + title + "'" + " was taken by reader");

    }

    @Override
    public void return_book() {

    }

    @Override
    public void deliver_book() {

    }

    @Override
    public void find_book() {

    }

    @Override
    public void give_book() {

    }

    @Override
    public void expired_book() {

    }
}


