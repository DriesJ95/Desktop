package opdracht_LibraryUML;

public class Book {
    private String title;
    private int pages;
    private BookCategory category;
    private Writer writer;

    public Book(){
        this("",0,null,new Writer("Anonymous"));
    }

    public Book(String title, int pages, BookCategory category){
        this(title,pages,category,new Writer("Anonymous"));
    }
    public Book(String title, int pages, BookCategory category, Writer writer){
        setTitle(title);
        setPages(pages);
        setCategory(category);
        this.writer = writer;
    }

    public Writer getWriter(){
        return writer;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getPages() {
        return pages;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }

    public BookCategory getCategory() {
        return category;
    }

    public void setCategory(BookCategory category) {
        this.category = category;
    }

    @Override
    public String toString(){
        return this.getTitle()+ ", " + this.getPages() + " pages and " + this.getCategory() + " category\n";
    }
}
