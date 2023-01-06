package Practice;

public class Books {
    //(a)instance constant
    public final String BOOK_COMPANY="Thonsie";

    //(b)Class variable
    public static String bookName;

    //(c) Default constructor
    public Books(){
        this.bookName="fundamentals of Java";
        this.bookPages=350;
    }

    //(d)getters
    public String getBOOK_COMPANY() {
        return BOOK_COMPANY;
    }

    public static int getBookPages() {
        return bookPages;
    }

    public static void setBookPages(int bookPages) {
        Books.bookPages = bookPages;
    }

    public static String getBookName() {
        return bookName;
    }

    //(e)setters
    public static void setBookName(String bookName) {
        Books.bookName = bookName;
    }

    // (f) static variable
    public static int bookPages;

    public static void main(String[] args) {
        Books book1 = new Books();
    }

}
