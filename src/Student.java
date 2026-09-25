public class Student extends User {

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
         super.Borrow(item);
     }
     else {
         System.out.println("Students can only borrow books");
     }

    }

    void ReturnItem(LibraryItem book)
    {
        book.ReturnItem();
        BorrowedItem=null;
    }

}
