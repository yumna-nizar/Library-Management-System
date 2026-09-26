class Book extends LibraryItem{
    Author author;

    public Book(String ItemId,String Title,Author author,int noOfCopies)
    {
        super(ItemId,Title,noOfCopies);
        this.author=author;


    }

    @Override
    void ShowDetails()
    {
        System.out.println("ItemId: "+ItemId);
        System.out.println("Title: "+Title);
//        System.out.println("IsAvaialable: "+IsAvailable);
        System.out.println("author: "+author.getName());
    }


    public String toString()
    {
        return ""+Title;

    }


}
