package StudyRooms;

public class Library {

    private String nameOfBook; //название книги
    private String author; //автор
    private int yearOfPublishing; //год издания

    public Library(String nameOfBook, String author, int yearOfPublishing){
        this.nameOfBook = nameOfBook;
        this.author = author;
        this.yearOfPublishing = yearOfPublishing;
    }

    public String getNameOfBook() {
        return nameOfBook;
    }

    public void setNameOfBook(String nameOfBook) {
        this.nameOfBook = nameOfBook;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getYearOfPublishing() {
        return yearOfPublishing;
    }

    public void setYearOfPublishing(int yearOfPublishing) {
        this.yearOfPublishing = yearOfPublishing;
    }
}
