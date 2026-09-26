import java.util.ArrayList;
import java.util.Scanner;

public class Library implements ItemOperations {

    private ArrayList<Book> books=new ArrayList<>();
    private ArrayList<Magazine> magazines=new ArrayList<>();

    Library()
    {
//        this.bookCount=0;
//        this.magazineCount=0;
    }

    @Override
    public void addItem(LibraryItem newItem) {
        /*adding item to the library
        if the item is book then add it to book arrayList of library
        if the item is magzine then add it to magazine arrayList of library*/
        if(newItem instanceof Book)
        {
           books.add((Book)newItem); //downcasting the given item to book and storing it in books arraylist
        }
        else {
            magazines.add((Magazine) newItem); //downcasting the given item to magazine and storing it in magazine arraylist
        }



    }

    @Override
    public void removeItem(String ItemId) {
        /*removes the item.iterating through the book
        arraylist to find if the given ItemId matches the ItemId of any Book*/
        for(Book b:books)
        {
            if(b.ItemId.equalsIgnoreCase(ItemId))
            {
                books.remove(b);
                return;
            }

        }
        /*iterating through the magazine arraylist to find if the
        given ItemId matches the ItemId of any magazine*/
        for (Magazine m:magazines)
        {
            if(m.ItemId.equalsIgnoreCase(ItemId))
            {
                magazines.remove(m);
                return;
            }

        }


    }

    @Override
    public void displayItem() {
        Scanner sc=new Scanner(System.in);
        System.out.println("which one do you want to display?\n1.Books\n2.Magazines");
        int option=sc.nextInt();
        if(option==1)
        {
            System.out.println("list of Books in the library:");
            for(Book b:books) {
                System.out.println(b);
            }
//        for(int i=0;i<bookCount;i++) {
//            System.out.println(books[i].Title);
        }

        else if(option == 2)
        {
            System.out.println("list of magazines in the library is:");
            for(Magazine m:magazines) {
                System.out.println(m);
            }
//        for(int i=0;i<magazineCount;i++)
//        {
//            System.out.println(magazines[i].Title);
//        }

        }

    }

    //
//    @Override
//    public void AddBook(Book newBook) {
//        if(bookCount<books.length)
//        {
//            books[bookCount]=newBook;
//            bookCount++;
//            System.out.println(newBook+" book has been added to library.");
//            //since toString method is overridden in the Book class newBook is giving here the book name only not the refernce address inside the newBook.
//        }
//        else {
//            System.out.println("Library is full..no more books can be added");
//        }
//
//
//
//
//    }
//
//    @Override
//    public void RemoveBook(String bookID) {
//        int i=0;
//        while( i<bookCount)
//        {
//            if(books[i].ItemId.equals(bookID))
//            {
//                books[i]=books[bookCount-1];
//                books[bookCount-1]=null;
//                bookCount--;
//                System.out.println("book has been removed from library: "+bookID);
//                return;
//            }
//
//        }
//        System.out.println("book not found");
//
//    }
//
//    @Override
//    public void DisplayBook() {
//        System.out.println("list of Books in the library:");
//        for(int i=0;i<bookCount;i++)
//        {
//            System.out.println(books[i].Title);
//        }
//
//    }
//
//    @Override
//    public void AddMagazine(Magazine newMg) {
//        if(magazineCount<magazines.length)
//        {
//            magazines[magazineCount]=newMg;
//            magazineCount++;
//            System.out.println(newMg+" has been added to library");
//        }
//        else {
//            System.out.println("library is full..no more magazines can be added to library");
//        }
//
//    }
//
//    @Override
//    public void RemoveMagazine(String mgID) {
//        int i=0;
//        while( i<magazineCount)
//        {
//            if(magazines[i].ItemId.equals(mgID))
//            {
//                magazines[i]=magazines[magazineCount-1];
//                magazines[magazineCount-1]=null;
//                bookCount--;
//                System.out.println("magazine has been removed from library: "+mgID);
//                return;
//            }
//
//        }
//        System.out.println("book not found");
//
//
//    }
//
//    @Override
//    public void DisplayMagazine() {
//        System.out.println("list of magazines in the library is:");
//        for(int i=0;i<magazineCount;i++)
//        {
//            System.out.println(magazines[i].Title);
//        }
//
//    }
}
