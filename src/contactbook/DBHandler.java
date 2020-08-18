/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package contactbook;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author owner
 */
public class DBHandler {
    Connection con;
//    private PreparedStatement pstmt1;
//    private PreparedStatement pstmt2;
//    private PreparedStatement pstmt3;
    
    public void dbConnection(){
        
        String driverURL = "com.mysql.jdbc.Driver";
        String conURL = "jdbc:mysql://localhost:3306/contact_book";
        String dbUserName = "root";
        String dbPassword = "WisdomTech@123";
        
        try {    
            Class.forName(driverURL);
            con = DriverManager.getConnection(conURL,dbUserName,dbPassword);
            System.out.println("Connection Established Successfully!");
        } catch (ClassNotFoundException ex) {
            System.out.println("Driver not found!");
            Logger.getLogger(DBHandler.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            System.out.println("Connection Not Established!");
            Logger.getLogger(DBHandler.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    Connection getCon(){
        return con;
    }
    
    
    
}
