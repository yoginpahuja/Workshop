import java.time.LocalDate;
import java.util.*;
public class LibrarySystem {
    public static void main(String[] args){

        Library library=new Library();
        Book book1 = new Book("Book1","Author1","pub1","gen1",180);
        Book book2 = new Book("Book2","Author2","pub2","gen2",200);
        Book book3 = new Book("Book3","Author3","pub3","gen3",220);
        Member member1=new Member("Member1","Address1","123-456","xyz@gmail.com");
        Member member2=new Member("Member2","Address2","123-456","xyz@gmail.com");
        Member member3=new Member("Member3","Address3","123-456","xyz@gmail.com");
        library.addBook(book1);
        library.addBook(book2);
        library.addBook(book3);
        library.addMember(member1);
        library.addMember(member2);
        library.addMember(member3);

         Integer y,m,d;
         LocalDate ld;
        while(true)
        {
           Scanner scn=new Scanner(System.in);
           int control;
           System.out.println("Press 1 to checkout a book");
           System.out.println("Press 2 to checkin a book");
           System.out.println("Press 3 to exit");
           control=scn.nextInt();
           if(control==1)
           {
             System.out.println("Please enter the due date for the checkout");
             System.out.println("Enter the year");
             y=scn.nextInt();
             System.out.println("Enter the month");
              m=scn.nextInt();
             System.out.println("Enter the day");
              d=scn.nextInt();
              ld=LocalDate.of(y,m,d);
              library.checkOutBook(book1,member1,ld);
           }
           else if (control==2)
           {
            System.out.println("Please enter the book name to be checked in : ");
            String bookName=scn.next();
            library.checkInBook(book1);
           }
           else if (control==3)
           {
            break;
           }
          
          
        }
         library.generateBookList();
         library.generateMemberList();
         library.generateCheckedoutBooksList();
         library.calculateOverdueFines(member1);
         library.generateOverdueBooksList();
    }
}
