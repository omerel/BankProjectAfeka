
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.ResultSetMetaData;


public class Restaurants
{
    private static String dbURL = "jdbc:derby://localhost:1527/Bank;create=true;user=user;password=123";
    private static String tableName = "person";
    // jdbc Connection
    private static Connection conn = null;
    private static Statement stmt = null;

    public static void main(String[] args)
    {
        createConnection();
        System.out.println("BLABALBALBALBLA");
        insertRestaurants( 4, "Tal");
    }
    
    private static void insertRestaurants(int id, String restName)
    {
        try
        {
        	
            stmt = conn.createStatement();
            stmt.execute("insert into " + tableName + " values (" +
                    id + ",'" + restName +"')");
            stmt.close();
        }
        catch (SQLException sqlExcept)
        {
            sqlExcept.printStackTrace();
        }
    }
    
    private static void createConnection()
    {
        try
        {
            Class.forName("org.apache.derby.jdbc.ClientDriver").newInstance();
            //Get a connection
            conn = DriverManager.getConnection(dbURL); 
        }
        catch (Exception except)
        {
        	 System.out.println("BAD");
            except.printStackTrace();
        }
    }
}