// 1.You are creating a library management application. What data will
// you add in the following classes? Create class, assign values and
// print them.
// User
// Book
// Card
// ReminderMessage

class user{
    int regno;
    String name;
    int age;
    long mobileNo;
}
class Book{
    String bookName;
    String authorName;
    int bookPrice;
}
class Card{
    String name;
    int regNo;
    long mobileNO;
    String address;
    String currentBookStatus;
}
class ReminderMessage{
    String msg;
}
public class LibraryManagement{
    public static void main(String[] args) {
        user santhosh = new user();
        Book book = new Book();
        Card card = new Card();
        ReminderMessage reminder = new ReminderMessage();

        santhosh.name="santhosh";
        santhosh.age = 20;
        santhosh.regno = 147;
        santhosh.mobileNo = 656666555l;

        book.authorName ="thiruvalluvar";
        book.bookName = "thirukural";
        book.bookPrice = 100;

        card.mobileNO = 656666555l;
        card.address = "xyz street";
        card.currentBookStatus = "thirukural 5days ago";
        card.regNo = 147;
        card.name = "santhosh";

        reminder.msg = "7 days left for this book";

        System.out.println(book.authorName);
        System.out.println(book.bookName);
        System.out.println(book.bookPrice);
        System.out.println(card.mobileNO +  "\n" +card.name +"\n"  + card.regNo + "\n"+ card.currentBookStatus +  "\n" + card.address);
        System.out.println(reminder.msg);
        System.out.println(santhosh.name + "\n" + santhosh.age +"\n" + santhosh.regno + "\n" + santhosh.mobileNo);
    }
}
