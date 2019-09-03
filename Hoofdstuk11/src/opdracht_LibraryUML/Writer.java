package opdracht_LibraryUML;

public class Writer {
    private String name;
    private Book [] writtenBooks;

    public Writer(){
        this("",null);
    }

    public Writer(String name){
        setName(name);
    }

    public Writer(String name, Book [] books){
        setName(name);
        setBooksWritten(books);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Book[] getBooksWritten() {
        return writtenBooks;
    }

    public void setBooksWritten(Book[] books) {
        this.writtenBooks = books;
    }

    @Override
    public String toString(){
        return this.getName() + " ";
    }
}
