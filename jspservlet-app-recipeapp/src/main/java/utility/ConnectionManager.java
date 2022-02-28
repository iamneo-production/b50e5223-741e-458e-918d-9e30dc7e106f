package utility;

import java.sql.*;

public class ConnectionManager{

    protected static Connection getConnection() throws ClassNotFoundException, SQLException{
        Class.forName("com.mysql.jdbc.Driver");
        Connection con= null;
        con = DriverManager.getConnection("jdbc:mysql://localhost/foodRecipeapp","root","examly");
        
        return con;

       
    }
    public static Connection initializeDatabase() {
        return null;
    }
    public static void main(String[] args) throws ClassNotFoundException, SQLException{
        getConnection();


    
    }
}