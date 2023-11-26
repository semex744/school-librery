
public class Rental {
     String date;
   Book book;
   Person person;

    public Rental( Book book, Person person) {

        this.book = book;
        this.person = person;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {

     this.date = date;
    }

    public Book getBook() {

        return book;
    }

    public void setBook(Book book) {
        this.book = book;
    }

    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }
}