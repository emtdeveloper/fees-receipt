package fees.receipt;
import java.sql.*;
import javax.swing.*;

public class mysqlconnect {

    Connection conn=null;
    public static Connection ConnectDB(){
        try{
            Class.forName("com.mysql.jdbc.Driver");
            Connection conn=DriverManager.getConnection("jdbc:mysql://localhost/fees_receipt","root","root");
          
            JOptionPane.showMessageDialog(null,"Connected to database");
            return conn;
        }
    catch(Exception e){
     JOptionPane.showMessageDialog(null, e );
     return null;

}

    }
    
}  

