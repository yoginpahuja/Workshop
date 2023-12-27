import java.time.LocalDate;
import java.time.Period;
import java.util.*;
class Library{
    List<Book> books=new ArrayList<>();
    List<Member> members=new ArrayList<>();
    List<Loan> loans=new ArrayList<>();
    public void addBook(Book book)
    {
        books.add(book);
    }
    public void addMember(Member member)
    {
        members.add(member);
    }
    public void checkOutBook(Book book,Member member,LocalDate dueDate){
        for(Loan loan:loans)
        {
            if(loan.book==book)
            {
                System.out.println("Book not available");
                return;
            }
        }
        if(books.contains(book) && members.contains(member)){
            Loan loan=new Loan(book,member,dueDate);
            loans.add(loan);
        }else{
            System.out.println("Book or member not found");
        }
    }
    public void checkInBook(Book book){
        loans.removeIf(loan->loan.book.equals(book));
    }
    public void calculateOverdueFines(Member mem)
    {
       for(Loan loan:loans)
       {
        if(loan.member==mem)
        {
            LocalDate today=LocalDate.now();
            if(today.isAfter(loan.dueDate))
            {
                Period period=Period.between(today, loan.dueDate);
                int days=-period.getDays();
                int fine=100*days;
                System.out.println("The fine is amounted to : Rs. "+ fine);
                break;
            }
        }
       }
    }
   public void generateBookList(){
    System.out.println("List of all books in the library: ");
    for(Book book : books){
        System.out.println(book.title);
    }
   }
   public void generateMemberList(){
    System.out.println("List of all members of the library: ");
    for(Member member:members)
    {
        System.out.println(member.name);
    }
   }
   public void generateCheckedoutBooksList(){
    System.out.println("List of all books currently checked out: ");
    for(Loan loan:loans){
        System.out.println(loan.book.title + " Checked out to: " + loan.member.name + ")");
    }
   }
   public void generateOverdueBooksList(){
     LocalDate today=LocalDate.now();
     for(Loan loan:loans)
     {
        if(today.isAfter(loan.dueDate))
        {
            System.out.println("Book Name : " + loan.book + "Member name : "+loan.member);
        }
     }
   }
}



