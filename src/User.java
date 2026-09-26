public class User {
    String UserId;
    String Name;
//     LibraryItem BorrowedItem;



     public User(String UserId,String Name)
     {
         this.UserId=UserId;
         this.Name=Name;
//         this.BorrowedItem=null;

     }



    void Borrow(LibraryItem libraryItem)
    {
//        if(BorrowedItem!=null)
//        {
//            System.out.println(Name +" has already borrowed an item, return it first");
//        }
//        else {
//            if(libraryItem.isAvailable())
//            {
//                libraryItem.BorrowItem();
//                BorrowedItem=libraryItem;
//            }
//        }


    }
    void ReturnItem(LibraryItem returningBook)
    {
//        if (BorrowedItem == null) {
//            System.out.println(Name+" Borrowed nothing");
//        }
//        else {
//
//            BorrowedItem.ReturnItem();
//            BorrowedItem=null;
//        }



    }
    void showBorrowedItems()
    {
//        if(BorrowedItem!=null) {
//            System.out.println(Name+" has borrowed:");
//            BorrowedItem.ShowDetails();
//        }
//        else
//        {
//            System.out.println(Name+ " has Borrowed nothing");
//        }

    }
}
