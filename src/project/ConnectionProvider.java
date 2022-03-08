/*
 SQl Connection Code : 
import java.sql.*; 
import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.DriverManager;
import java.sql.SQLException;
public class TestDataBase {
    public static void main (String args[]) throws SQLException{
    try{
    String host = "jdbc:derby://localhost:1527/Student" ; 
    String uname = "Mix"; 
    String upass = "mix"; 
    Connection con = DriverManager.getConnection(host ,uname ,upass) ; 
    Statement stmt = con.createStatement(); 
    String SQL = "SELECT * FROM student"; 
    ResultSet rs = stmt.executeQuery(SQL);
 */
package project;
 
import java.sql.*; 
import java.sql.Connection;
import java.sql.DriverManager;
public class ConnectionProvider {
    public static Connection getCone(){
    try{
    Class.forName("com.mysql.cj.jdbc.Driver");
    Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/hotel" ,"root","123456") ; 
    return con;
    }
     catch (Exception e) {
        return null ; 
     }      
}
}
