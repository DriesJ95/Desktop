package opdracht_LibraryUML;

public class LibraryApp {
    public static void main(String[] args) {
        Book book1 = new Book("Flierefluiter",328,BookCategory.MYSTERY);
        Book book2 = new Book("Dierenfluiter",237,BookCategory.BIOGRAPHY);
        Book book3 = new Book("Pierenfluiter",159,BookCategory.SCIENCEFICTION);
        Book book4 = new Book("Stierenfluiter",187,BookCategory.BIOGRAPHY);
        Book book5 = new Book("Gierenfluiter",166,BookCategory.MYSTERY);
        Book [] collection = new Book [] {book1,book2,book3,book4,book5};
        Writer writer1 = new Writer("Johnny");
        Writer writer2 = new Writer("Garfield");
        Writer writer3 = new Writer("Edward");
        Writer [] writers = new Writer [] {writer1,writer2,writer3};

        Library bib = new Library("INTECbib",collection,writers);
        System.out.println(bib.toString());

    }
}
