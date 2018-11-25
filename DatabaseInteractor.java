import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseInteractor {
    private static final String DB_URL = "jdbc:mysql://localhost/library";
    private static final String DB_USERNAME = "javaUser";
    private static final String DB_PASSWORD = "password";

    protected Connection c;

    public void connectToDatabase(){
        Connection connection;
        try {
            connection = DriverManager.getConnection(DB_URL, DB_USERNAME, DB_PASSWORD);
        } catch (SQLException e) {
            throw new IllegalStateException("Cannot connect to the database.", e);
        }

        this.c = connection;
    }
}
