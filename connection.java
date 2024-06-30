import java.sql.*;

public class connection {

    Connection conn;
    Statement statement;
    public connection(){
        try{
           conn= DriverManager.getConnection("jdbc:mysql://localhost:3306/bank","root","Manjima@mysql123");
           statement = conn.createStatement();
        }catch(SQLException e){
            e.printStackTrace();
        }
    }
}
