public class test {
    public static void main(String[] args)
    {
        Book book1 = new Book("Book1","Author1","pub1","gen1",180);
        System.out.println(book1.title);
        Library library=new Library();
        library.addBook(book1);
        System.out.println(library.books.get(0).title);
    }
}
