import java.util.ArrayList;
import java.util.ListIterator;

public class Student extends User {
    ArrayList<Book> borrowedbooks=new ArrayList<>(5);

    public Student(String UserId,String Name)
    {
        super(UserId,Name);
        this.UserId=UserId;
        this.Name=Name;

    }


    void Borrow(LibraryItem item)
    {
     if(item instanceof Book)
     {
         if(borrowedbooks.size()<5)
         {
             if(item.noOfCopies!=0)
             {
                 borrowedbooks.add((Book) item);
                 item.noOfCopies--;
                 System.out.println("borrowed succesfully");

             }
             else {
                 System.out.println("there is no copies of this book left");
             }

         }
         else {
             System.out.println("a student can only borrow 5 books maximum");
         }
     }
     else {
         System.out.println("Students can only borrow books");
     }

    }

    void ReturnItem(LibraryItem returningBook)
    {
        ListIterator<Book> itr=borrowedbooks.listIterator();
        Book b;
        boolean found=false;
        /*iterating through the borrowedbooks arraylist of the this student to find if the
        item which is trying to return actually belongs to the arraylist or not.*/
        while(itr.hasNext()) {
            if((b=itr.next())==returningBook)
            {
                /*if the iterator returned the book which matches the book that
                has mentioned in the returningBook then the book's copies will get
                 increased*/
                returningBook.noOfCopies++;
                itr.remove();
                found=true;
            }
        }
        /*if the iterator has reached the end and still not found the book
        mentioned in returningBook then it should
        show no such book borrowed  to return*/
        if( !itr.hasNext() && found==false )
        {
            System.out.println("no such book borrowed to return");
        }


    }

    void showBorrowedItems()
    {
        for(Book b:borrowedbooks)
        {
            System.out.println(b);
        }
    }


}
