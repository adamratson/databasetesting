public class Book {
    private String title;
    private String author;

    public Book(String title, String author){
        this.title = title;
        this.author = author;
    }

    public String getTitle(){
        return this.title;
    }

    public void setTitle(String t){
        this.title = t;
    }

    public String getAuthor(){
        return this.author;
    }

    public void setAuthor(String a){
        this.author = a;
    }
}
