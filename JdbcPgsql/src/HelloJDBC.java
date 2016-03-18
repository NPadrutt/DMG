import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class HelloJDBC {

    public static void main(String[] args) {
        try {
            Class.forName("org.postgresql.Driver");
            Connection connection = DriverManager.getConnection(
                    "jdbc:postgresql://127.0.0.1:5432/uni","postgresd", "abcd-1234");
            Statement statement = connection.createStatement();
            ResultSet resultset = statement.executeQuery(
                    "SELECT * FROM PROFESSOREN");
            while (resultset.next()) {
                System.out.println(resultset.getString(2));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
