public class LibraryMain {
    static void main() {

        //authors
        Author author1=new Author("yumna","was a great scintist",3);
        Author author2=new Author("yusra","was a great artist",1);




        //libary items

        Book b1=new Book("B001","the wings of fire",author1,4);
        b1.ShowDetails();
        Book b2=new Book("B002","natioanalgeographic",author2,5);
        Book b3=new Book("B003","malala",author1,3);
        Book b4=new Book("B004","it ends with us",author2,8);
        Magazine m1=new Magazine("M001","kusumum",10,6);
        Magazine m2=new Magazine("M004","Fog",12,4);
        Magazine m3=new Magazine("M002","Vanitha",1,2);
        Magazine m4=new Magazine("M003","Vogue",15,3);


        Library lib=new Library();
        lib.addItem(b1);
        lib.addItem(b2);
        lib.addItem(b3);
        lib.addItem(m1);
        lib.addItem(m2);
        lib.addItem(m3);
        lib.addItem(m4);
//        lib.displayItem();
//
//        lib.displayItem();
//        lib.AddBook(b1);
//        lib.AddBook(b2);
//        lib.AddBook(b3);
//        lib.AddBook(b4);
//        lib.RemoveBook("B001");
//        lib.DisplayBook();
//
//        lib.AddMagazine(m1);
//        lib.AddMagazine(m2);
//        lib.AddMagazine(m3);
//        lib.DisplayMagazine();
//
//
        //users
        Student s1=new Student("S001","Nasreen");
        Student s2=new Student("S002","yusra");
        Student s3=new Student("S003","noul");
        Professor p1=new Professor("P001","sabira");
        Professor p2=new Professor("P002","faseela");
        Professor p3=new Professor("P003","naseera");

        s1.Borrow(b1);
        s1.Borrow(b2);
//        s1.Borrow(b3);


        s1.ReturnItem(b3);
//        s1.Borrow(b1);
//        s1.Borrow(b1);
//        s1.showBorrowedItems();
//        s1.Returning();
//        s1.Borrow(b2);
//        s1.showBorrowedItems();
//        p1.Borrow(m1);
//        p1.Returning();
//        p1.showBorrowedItems();
//
//        p1.showBorrowedItems();


    }
}
