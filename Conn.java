/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
package bank.management.system;

/**
 *
 * @author Naman
 */
/*
*JDBC Connection Steps:
* Register the Driver 
* Create Connection
* Create Statement
* Execute Query 
* Close Connection
*
*/
import java.sql.*;

public class Conn {
    Connection c;
    Statement s;
    
    //Constructor 
    public Conn()
    {
        try{
            //Register the driver
            //Class.forName(com.mysql.cj.jdbc.Driver); //no need for latest
            //Create the connection 
            c = DriverManager.getConnection("jdbc:mysql:///bankmanagementsystem","root","Y1012Jqkhkp");
            //Create statement
            s = c.createStatement();
            
            
            
        } 
        catch(Exception e)
        {
            System.out.println(e);
        }
    }
}
