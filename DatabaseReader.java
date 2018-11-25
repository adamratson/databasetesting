import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class DatabaseReader extends DatabaseInteractor {
    public ArrayList<Book> getBooks(){
        ArrayList<Book> books = new ArrayList<>();

       connectToDatabase();

        Statement stmt;
        try {
            stmt = c.createStatement();
        } catch (SQLException e) {
            throw new IllegalStateException("Cannot create a statement.", e);
        }

        ResultSet rs;

        try {
            String sql;
            sql = "SELECT title, author FROM book;";
            rs = stmt.executeQuery(sql);
        } catch (SQLException e) {
            throw new IllegalStateException("The query failed to run.");
        }

        try {
            while (rs.next()) {
                books.add(new Book(rs.getString("title"), rs.getString("author")));
            }
        } catch (SQLException e){
            throw new IllegalStateException("Failed to look through the result set.", e);
        }

        return books;
    }
}
