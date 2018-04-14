/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author X
 */
public class koneksipbo {
    protected Connection con;
    protected Statement state;
    
    public koneksipbo (String username, String password, String db ) throws SQLException{
        
        String url = "jdbc:mysql://localhost:3306/"+db;
        con = DriverManager.getConnection(url, username, password);
        state = con.createStatement();   
    }
    
    public void execute (String sql) throws SQLException{
        this.state.executeUpdate(sql);
    }
    
    public ResultSet getResult(String sql) throws SQLException{
        return state.executeQuery(sql);
    }
}
