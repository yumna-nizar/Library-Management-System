class Magazine extends LibraryItem{
    int IssueNO;

    public Magazine(String ItemId,String Title,int IssueNo,int noOfCopies)
    {
        super(ItemId,Title,noOfCopies);
        this.IssueNO=IssueNo;


    }

    @Override
    void ShowDetails()
    {
        System.out.println("ItemId: "+ItemId);
        System.out.println("Title: "+Title);
//        System.out.println("IsAvaialable: "+IsAvailable);
        System.out.println("Issue Number: "+IssueNO);
    }
    public String toString()
    {
        return Title;
    }



}
