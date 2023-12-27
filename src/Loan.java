import java.time.LocalDate;
import java.util.*;
class Loan{
    Book book;
    Member member;
    LocalDate dueDate;

    public Loan(Book book,Member member,LocalDate dueDate){
        this.book=book;
        this.member=member;
        this.dueDate=dueDate;
    }
}