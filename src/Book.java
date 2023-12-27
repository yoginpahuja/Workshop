class Book extends LibraryItem{
    String genre;
    int noOfPages;
    public Book(String title,String author,String publisher,String genre,int noOfPages){
        super(title,author,publisher);
        this.genre=genre;
        this.noOfPages=noOfPages;
    }
}