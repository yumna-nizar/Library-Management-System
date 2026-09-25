
abstract public class LibraryItem {
    public String ItemId;
    public String Title;
     protected boolean IsAvailable;


    public LibraryItem(String ItemId,String Title)
    {
        this.Title=Title;
        this.ItemId=ItemId;
       this.IsAvailable=true;
    }


    public boolean isAvailable()
    {
        return IsAvailable;
    }



    void BorrowItem()
    {
        if(IsAvailable){
            System.out.println(Title+" borrowed successfully");
            IsAvailable=false;
        }
        else {
            System.out.println(Title+" is not currently available");
        }


    }
    void ReturnItem()
    {
        IsAvailable=true;
        System.out.println(Title+"  is returned successfully");

    }
    abstract void ShowDetails();
}



