
abstract public class LibraryItem {
    public String ItemId;
    public String Title;
//     protected boolean IsAvailable;
    public int noOfCopies;




    public LibraryItem(String ItemId,String Title,int noOfCopies)
    {
        this.Title=Title;
        this.ItemId=ItemId;
        this.noOfCopies=noOfCopies;
//       this.IsAvailable=true;
    }


//    public boolean isAvailable()
//    {
//        return IsAvailable;
//    }



//    void BorrowItem()
//    {
//        if(IsAvailable){
//            System.out.println(Title+" borrowed successfully");
//            IsAvailable=false;
//        }
//        else {
//            System.out.println(Title+" is not currently available");
//        }
//        if(noOfCopies>0)
//        {
//            noOfCopies--;
//            System.out.println(Title+" book borrowed succesfully");
//        }
//        else {
//            System.out.println("there is no copies available of this book.");
//        }
//
//
//
//    }
//    void ReturnItem()
//    {
//        IsAvailable=true;
//        System.out.println(Title+"  is returned successfully");
//        noOfCopies++;
//
//
//    }
    abstract void ShowDetails();
}



