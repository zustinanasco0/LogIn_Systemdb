
package DBConnection;


   
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnection {
    
            
            private static final String URL = "jdbc:mysql://localhost:3306/user_db";
            private static final String USER = "root" ;
            private static final String PASSWORD = "" ;
            
          


    public static Connection getConnection() {
        Connection conn = null;

        try {
            // Load the driver (Optional but recommended for older NetBeans versions)
            Class.forName("com.mysql.cj.jdbc.Driver");
            
            conn = DriverManager.getConnection(URL, USER, PASSWORD);
            System.out.println("Database Connected Successfully!");
            
        } catch (ClassNotFoundException e) {
            System.out.println("MySQL Driver not found!");
            e.printStackTrace();
        } catch (SQLException e) {
            System.out.println("Connection Failed!");
            e.printStackTrace();
        }

        return conn;
    }
}
            
            
            
        
   

   

