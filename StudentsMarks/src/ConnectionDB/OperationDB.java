package ConnectionDB;

import java.sql.Connection;
import java.sql.DriverManager;

public class OperationDB {

    static Connection con;
    static String driver = "com.mysql.jdbc.Driver";
    static String url = "jdbc:mysql://localhost/ict";
    static String uname = "root";
    static String pass = "1234";

    public static Connection getConnection() throws Exception{

        if(con == null){
            Class.forName(driver);
            con = DriverManager.getConnection(url, uname, pass);
        }
        return con;
    }

}
