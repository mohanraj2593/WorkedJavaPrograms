class User{
    String userName;
    int userId;
    String dob;
}
class Book{
    String BookName;
    String AuthorName;
    int BookYear;
}
class Card{
    String CardId;
    String StduentRegisterNo;
    String bookcheckindate;
    String bookcheckoutdate;
}
class RemainderMessage{
    String Days;
}
public class prg2Class2 {
    public static void main(String[] args) {
        User u1=new User();
        Book b1=new Book();
        Card c1=new Card();
        RemainderMessage r1=new RemainderMessage();
        u1.userName="Mohanraj";
        u1.userId=1;
        u1.dob="25/09/2003";
        b1.BookName="The Humanity";
        b1.AuthorName="Einstein";
        b1.BookYear=2003;
        c1.CardId="123";
        c1.StduentRegisterNo="51332010402";
        c1.bookcheckindate="12/10/2003";
        c1.bookcheckoutdate="14/10/2003";
        r1.Days="23";
        System.out.println("UserName:"+u1.userName);
        System.out.println("User Id:"+u1.userId);
        System.out.println("Date of Birth:"+u1.dob);
        System.out.println("Book Name:"+b1.BookName);
        System.out.println("Author Name:"+b1.AuthorName);
        System.out.println("Book year:"+b1.BookYear);
        System.out.println("Car Id:"+c1.CardId);
        System.out.println("Stuent Register No:"+c1.StduentRegisterNo);
        System.out.println("Book ChheckIn Date:"+c1.bookcheckindate);
        System.out.println("BookCheckOut Date:"+c1.bookcheckoutdate);
        System.out.println("Days:"+r1.Days);






    }
}
