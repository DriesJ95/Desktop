package opdracht_LibraryUML;

public class Library {
    private Book [] books;
    private Writer [] writers;
    private String name;

    public Library(){}

    public Library(String name, Book [] books, Writer [] writers){
        setName(name);
        setBooks(books);
        setWriters(writers);
    }

    public Writer[] getWriters() {
        return writers;
    }

    public void setWriters(Writer[] writers) {
        this.writers = writers;
    }

    public Book[] getBooks() {
        return books;
    }

    public void setBooks(Book[] books) {
        this.books = books;
    }

    public void addBook(Book book){
        Book [] temp = new Book [books.length+1];
        for (int i = 0; i < books.length; i++){
            temp[i] = books[i];
        }
        temp[books.length] = book;
        books = temp;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString(){
        System.out.println("The library '" + this.getName() + "' has the following collection:");
        String output = "";
        for (Book b : books){
            output = output.concat(b.toString());
        }
        for (Writer w : writers){
            output = output.concat(w.toString());
        }
        return output;
    }
}
