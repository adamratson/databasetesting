public class main {
    public static void main(String[] args){
        DatabaseReader dbr = new DatabaseReader();
        for (Book b : dbr.getBooks()){
            System.out.println(b.getTitle());
        }
    }
}
